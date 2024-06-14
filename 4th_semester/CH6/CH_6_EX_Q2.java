import java.util.Scanner;

class B
{
	int info;
	B link;
}

public class CH_6_EX_Q2
{
	static B start=null;
	static B last=null;
	static int c=0;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		
		B n=new B();
		System.out.println("Enter the info of first node:");
		n.info=sc.nextInt();
		n.link=null;
		
		start=last=n;
		
		System.out.println("Do you want to add more nodes?(y/n)");
		char c=sc.next().charAt(0);
		
		while(c=='y'||c=='Y')
		{
			n=new B();
			System.out.println("Enter the info:");
			n.info=sc.nextInt();
			last.link=n;
			
			last=n;
			
			System.out.println("Do you want to add more nodes?(y/n)");
			c=sc.next().charAt(0);
		}
	}
	
	public static void display()
	{
		B t=start;
		
		if(t==null)
		{
			System.out.println("List is Empty");
		}
		
		else
		{
			while(t!=null)
			{
				System.out.print(t.info+" -> ");
				t=t.link;
			}
		}
	}
	
	public static int count()
	{
		B t=start;
		
		if(t==null)
		{
			System.out.println("List is Empty");
		}
		
		else
		{
			while(t!=null)
			{
				t=t.link;
				c++;
			}
		}
		
		return c;
	}
	
	public static void insert_at_kth_position_from_end(int data,int k)
	{
		B t=start;
		int p=0;
		
		if(k<=c)
		{
			if(t==null)
			{
				System.out.println("List is empty");
			}
			
			else
			{
				while(t!=null && p<c-k)
				{
					t=t.link;
					p++;
				}
				
				B n=new B();
				n.info=data;
				n.link=t.link;
				t.link=n;
			}
		}
		
		else
		{
			System.out.println("-1");
		}
	}
	
	public static void main(String[] args) 
	{
		create();
		display();
		System.out.println("\n"+count());
		
		System.out.println();
	
		insert_at_kth_position_from_end(100,2);
		display();
	}
}
