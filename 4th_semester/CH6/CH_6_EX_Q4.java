
import java.util.Scanner;

class K
{
	int info;
	K link;
}

public class CH_6_EX_Q4
{
	static K start=null;
	static K last=null;
	static int c=0;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		
		K n=new K();
		System.out.println("Enter the info of first node:");
		n.info=sc.nextInt();
		n.link=null;
		
		start=last=n;
		
		System.out.println("Do you want to add more nodes?(y/n)");
		char c=sc.next().charAt(0);
		
		while(c=='y'||c=='Y')
		{
			n=new K();
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
		K t=start;
		
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
		K t=start;
		
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
	
	public static int duplicates(int x)
	{
		K t=start;
		int q=0;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			
			while(t!=null)
			{
				if(t.info==x)
				{
					q++;
				}
				t=t.link;
			}
			
		}
		return q;
	}
	
	public static void main(String[] args) 
	{
		create();
		display();
		System.out.println("\n"+count());
		
		System.out.println("\n"+duplicates(5));
	}

}
