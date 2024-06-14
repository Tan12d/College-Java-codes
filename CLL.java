import java.util.Scanner;

class CLL_Node
{
	int info;
	CLL_Node link;
}

public class CLL 
{
	static CLL_Node start=null;
	static CLL_Node last=null;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		CLL_Node n=new CLL_Node();
		System.out.println("Enter the info of first node:");
		n.info=sc.nextInt();
		start=last=n;
		last.link=start;
		
		System.out.println("Do you want to add more nodes?(y/n)");
		char ch=sc.next().charAt(0);
		
		while(ch == 'y' || ch== 'Y')
		{
			n= new CLL_Node();
			System.out.println("Enter the info of next node:");
			n.info=sc.nextInt();
			
			last.link=n;
			last=n;

			last.link=start;
			
			System.out.println("Do you want to add more nodes?(y/n)");
			ch=sc.next().charAt(0);
		}
	}

	public static void display()
	{
		if(start==null)
		{
			System.out.println("The list is empty");
			return;
		}
		else if(start.link==start)
		{
			System.out.print(start.info +" --> ");
		}
		else
		{
			CLL_Node t=start;
			System.out.println("the list is:");
			
			do
			{
				System.out.print(t.info +" --> ");
				t=t.link;
			}while(t.link!=start);
			
			System.out.print(t.info);
		}
	}
	
	public static int count()
	{
		if(start==null)
		{
			return 0;
		}
		else if(start.link==start)
		{
			return 1;
		}
		else
		{
			int c=0;
			CLL_Node t=start;
			
			do
			{
				c++;
				t=t.link;
			}while(t.link!=start);
			
			c=c+1;
			return c;
		}
	}
	
	public static void insert_at_beg(int data)
	{
		CLL_Node n= new CLL_Node();
		n.info=data;
		
		if(start==null)
		{
			start=last=n;
			last.link=start;
		}
		else
		{
			n.link=start;
			start=n;
			last.link=start;
		}
	}
	
	public static void insert_at_end(int data)
	{
		CLL_Node n=new CLL_Node();
		n.info=data;
		
		if(start==null)
		{
			start=last=n;
			last.link=start;
		}
		else
		{
			last.link=n;
			last=n;
			last.link=start;
		}
	}
	
	public static void insert_at_any(int data, int key)
	{
		CLL_Node n=new CLL_Node();
		n.info=data;
		
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		else
		{
			CLL_Node t= start;
			
			while(t.link!=start && t.info!=key)
			{
				t=t.link;
			}
			
			if(last.info==key)
			{
				insert_at_end(data);
			}
			else if(t.link==start)
			{
				System.out.println("The node is not present");
				return;
			}
			else
			{
				n.link=t.link;
				t.link=n;
			}
		}
	}
	
	public static void delete_at_beg()
	{
		
		if(start==null)
		{
			System.out.println("List is empty...");
			return;
		}
		CLL_Node t=start;
		if(start.link==start)
		{
			start=last=null;
		}
		
		else
		{
			start=start.link;
			t.link=null;
			last.link=start;
			
			System.out.println("Deleted node: " +t.info);
		}
	}
	
	public static void delete_at_end()
	{
		if(start==null)
		{
			System.out.println("List is empty...");
			return;
		}
		CLL_Node t=last;
		
		if(start.link==start)
		{
			start=last=null;
		}
		
		else
		{
			CLL_Node p=start;
			
			while(p.link!=last)
			{
				p=p.link;
			}
			p.link=start;
			last=p;
			
			System.out.println("Deleted node= "+t.info);
		}
	}
	
	public static void delete_at_any(int key)
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		CLL_Node t=start;
		if(start.info==key)
		{
			delete_at_beg();
		}
		
		else if(last.info== key)
		{
			delete_at_end();
		}
		
		else
		{
			CLL_Node p=null;
			CLL_Node c=start;
			
			while(c.link!= start && c.info!=key)
			{
				p=c;
				c=c.link;
			}
			if(c.link==start)
			{
				System.out.println("Node is not present in the list");
				return;
			}
			
			else
			{
				p.link=c.link;
				c.link=null;
				
				System.out.println("Deleted node: " +c.info);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		create();
		display();
		
		System.out.println("\nTotal number of nodes= "+count());
		
		System.out.println("Insert at beginning:");
		int data1=sc.nextInt();
		insert_at_beg(data1);
		display();
		
		System.out.println("\nInsert at end:");
		int data2=sc.nextInt();
		insert_at_end(data2);
		display();
		
		System.out.println("\nInsert at any position:");
		int data3=sc.nextInt();
		System.out.println("Enter the node where you want to add:");
		int key=sc.nextInt();
		insert_at_any(data3,key);
		display();
        
         
		System.out.println("\nDelete at beg:");
		delete_at_beg();
		display();
		
		System.out.println("\nDelete at end:");
		delete_at_end();
		display();
		
		
		System.out.println("\nDelete at any:");
		int key1=sc.nextInt();
		delete_at_any(key1);
		display();
		
	}

}
