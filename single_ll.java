import java.util.HashSet;

public class single_ll
{
	static class n
	{
		int info;
		n link;
		
		n(int info)
		{
			this.info=info;
			this.link=null;
		}
	}
	
	static n start=null;
	
	public static void main(String[] args) 
	{
		start=new n(1);
		n a=new n(2);
		n b=new n(1);
		n c=new n(5);
		n d=new n(6);
		
		
		start.link=a;
		a.link=b;
		b.link=c;
		c.link=d;
		
		display();
		
//		System.out.println();
//		
//		insert(4);
//		display();
//		
//		System.out.println("\n"+ search(3));
//		
//		delete();
//		display();
//		
//		System.out.println();
//		
//		delete_value(5);
//		display();
		
//		System.out.println();
//		
//		delete_all_value(1);
//		display();

//		System.out.println();
//		reverse();
//		display();
		
		System.out.println();
		remove_dup();

	}
	
	public static void display()
	{
		n t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null)
			{
				System.out.print(t.info+" ");
				t=t.link;
			}
		}
		
	}
	
	public static void insert(int value)
	{
		n t=start;
		n prev=null;
		n x=new n(value);
		
		if(t==null)
		{
			System.out.println("list is empty");
		}
		
		else
		{
			while(t!=null && value>t.info)
			{
				prev=t;
				t=t.link;
			}
			
			if(t==null)
			{
				System.out.println("Not");
			}
			
			else
			{
				prev.link=x;
				x.link=t;
			}
		}
	}
	
	public static int search(int y)
	{
		n t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null)
			{
				if(t.info==y)
				{
					return 1;
				}
				
				t=t.link;
			}
		}
		
		return 0;
	}
	
	public static void delete()
	{
		n t=start;
		
		if(t==null)
		{
			System.out.println("list is empty");
		}
		
		else
		{
			start=start.link;
			t.link=null;
			
			System.out.println("First deleted node= "+t.info);
		}
	}
	
	public static void delete_value(int value)
	{
		n t=start;
		n prev=null;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null && t.info!=value)
			{
				prev=t;
				t=t.link;
			}
			
			if(t==null)
			{
				System.out.println("Not present");
			}
			
			else
			{
				prev.link=t.link;
				t.link=null;
				
				System.out.println("Deleted node= "+t.info);
			}
		}
	}
	
	public static void delete_all_value(int value)
	{
		n t=start;
		n prev=null;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null && t.info==value)
			{
				start=t.link;
				t=start;
			}
			
			while(t!=null)
			{
				prev=t.link;
				
				if(prev!=null && prev.info==value)
				{
					t.link=prev.link;
				}
				
				else
				{
					t=prev;
				}
			}
		}
	}
	
	public static void reverse()
	{
		n t=start;
		n prev=null;
		n next=null;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null)
			{
				next=t.link;
				t.link=prev;
				prev=t;
				t=next;
			}
			
			start=prev;
		}
	}
	
	public static void remove_dup()
	{
		n t=start;
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		while(t!=null)
		{
			h.add(t.info);
			t=t.link;
		}
		
		System.out.println(h);
	}
	
	
	

}