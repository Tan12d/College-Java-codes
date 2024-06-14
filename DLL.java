import java.util.Scanner;

class DLLnode
{
	int info;
	DLLnode Rlink;
	DLLnode Llink;
}
public class DLL 
{
	static DLLnode start=null;
	static DLLnode last=null;    
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		DLLnode n=new DLLnode();
		System.out.println("Enter the info of first node:");
		n.info=sc.nextInt();
		start=last=n;
		n.Rlink=null;
		n.Llink=null;
		
		System.out.println("Do you want to add more nodes?(y/n)");
		char ch=sc.next().charAt(0);
		
		while(ch=='y'|| ch== 'Y')
		{
			n=new DLLnode();
			System.out.println("Enter the info of next node:");
			n.info=sc.nextInt();
			n.Llink= last;
			n.Rlink=null;
			
			last.Rlink=n;
			last=n;
			
			System.out.println("Do you want to add more nodes?(y/n)");
			ch=sc.next().charAt(0);
		}
		
	}
	
	public static void display()
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		else
		{
			System.out.println("List you have created is....");
			DLLnode t=start;
			while(start!=null)
			{
				System.out.print(t.info+ " --> ");
				start=start.Rlink;
				last=last.Llink;
				
			}
			
			/*
			  t=last; 
			 while(t != null)
			{
			System.out.print(t.info + " --> ");
			 t=t.Llink;
			}
			System.out.println();
			
			*/
		}
	}
	
	public static int count()
	{
		if(start==null)
		{
			return 0;
		}
		else
		{
			DLLnode t=start;
			int c=0;
			while(t!=null)
			{
				c++;
				t=t.Rlink;
			}
			return c;
		}
	}

	public static void insert_at_beg(int data)
	{
		DLLnode n=new DLLnode();
		n.info=data;
		
		if(start==null)
		{
			start=last=n;
			n.Llink=null;
			n.Rlink=null;
		}
		
		else
		{
			n.Rlink=start;
			n.Llink=null;
			
			start.Llink=n;
			start=n;
		}
	}
	
	public static void insert_at_end(int data)
	{
		DLLnode n=new DLLnode();
		n.info=data;
		
		if(start==null)
		{
			start=last=n;
			n.Llink=null;
			n.Rlink=null;
		}
		
		else
		{
			last.Rlink=n;
			
			n.Llink=last;
			n.Rlink=null;
			
			last=n;
		}
	}
	
	public static void insert_at_any(int data, int key)
	{
		DLLnode n=new DLLnode();
		n.info=data;
		
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			DLLnode t=start;
			
			while(t!=null && t.info!=key)
			{
				t=t.Rlink;
			}
			
			if(t==null)
			{
				System.out.println("The key is not present in the list");
				return;
			}
			else if(last.info==key)
			{
				insert_at_end(data);
			}
			else
			{
				n.Rlink=t.Rlink;
				t.Rlink.Llink=n;
				n.Llink=t;
				t.Rlink=n;
			}
		}
	}
	
	/*
	 public static void insert_at_pos(int data, int pos)
	 
	{
		DLLnode n=new DLLnode();
		n.info=data;
		
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			DLLnode t=start;
			int c=1;
			
			while(t!=null && c < pos)
			{
				c++;
				t=t.Rlink;
			}
			
			if(t==null)
			{
				System.out.println("The key is not present in the list");
				return;
			}
			else if(c==count())
			{
				insert_at_end(data);
			}
			else
			{
				n.Rlink=t.Rlink;
				t.Rlink.Llink=n;
				n.Llink=t;
				t.Rlink=n;
				
			}
		}
	}
	*/
	
	public static void delete_at_beg()
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		
		DLLnode t=start;
		
		if(start.Rlink==null)
		{
			start=last=null;
		}
		else
		{
			start=start.Rlink;
			start.Llink=null;
			t.Rlink=null;
			
			System.out.println("deleted node: "+t.info);
		}
		
	}
	
	public static void delete_at_end()
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		
		DLLnode t=last;
		
		if(start.Rlink==null)
		{
			start=last=null;
		}
		else
		{
			last=last.Llink;
			last.Rlink=null;
			t.Llink=null;
			
			System.out.println("deleted node: "+t.info);
		}
	}
	
	public static void delete_at_any(int key)
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		
		else if(start.Rlink==null)
		{
			delete_at_beg();
		}
		else if(last.Llink==null)
		{
			delete_at_end();
		}
		else
		{
			DLLnode t=start;
			DLLnode p=null;
			
			while(t!=null && t.info!=key)
			{
				p=t;
				t=t.Rlink;
			}
			
			if(t==null)
			{
				System.out.println("The node is not present");
				return;
			}
			else
			{
				p.Rlink=t.Rlink;
				t.Rlink.Llink=p;
				t.Llink=null;
				t.Rlink=null;
				
				System.out.println("Deleted node= "+t.info);
			}
		}
	}
	
	public static void search(int key)
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			boolean u=false;
			
			DLLnode t=start;
			while(t!=null)
			{
			    if(t.info==key)
				{
					u=true;
					break;
				}
				t=t.Rlink;
			}
			
			if(u==true)
			{
				System.out.println("node is present");
			}
			else
			{
				System.out.println("node is not present");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		create();
		display();
		
		System.out.println("\nTotal number of nodes= "+count());
		
		int data1=sc.nextInt();
		insert_at_beg(data1);
		display();
		
		int data2=sc.nextInt();
		insert_at_end(data2);
		display();
		
		int data3=sc.nextInt();
		int key=sc.nextInt();
		insert_at_any(data3,key);
		display();
		
		
		int data4=sc.nextInt();
		int pos=sc.nextInt();
		insert_at_any(data4,pos);
		display();
		
		delete_at_beg();
        display();
        
        delete_at_end();
        display();
        
        int key7=sc.nextInt();
        delete_at_any(key7);
        display();
        
        int key6=sc.nextInt();
        search(key6);
        
	}

}
