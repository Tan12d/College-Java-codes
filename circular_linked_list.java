
public class circular_linked_list 
{
	static class cll
	{
		int info;
		cll link;
		
		cll(int info)
		{
			this.info=info;
			this.link=null;
		}
	}
	
	static cll start=null;
	static cll r=null;
	static int c=0;
	
	public static void main(String[] args) 
	{
		r=start=new cll(90);
		cll a=new cll(12);
		cll b=new cll(2);
		cll c=new cll(55);
		cll d=new cll(43);
		
		start.link=a;
		a.link=b;
		b.link=c;
		c.link=d;
		d.link=start;
		
		display();		
		System.out.println("\nCount= "+count());
		System.out.println();
		
		insert_at_front(78);
		display();
		
		System.out.println();
		
		insert_at_end(100);
		display();
		
		System.out.println();
		
		System.out.println(search(100));
		
		System.out.println();
		
		delete_at_front();
		display();
		
		System.out.println();
		
		delete_with_value(43);
		display();
		
		System.out.println();
		
		reverse();
//		display();		
	}
	
	public static void display()
	{
		cll t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t.link!=start)
			{
				System.out.print(t.info+" -> ");
				t=t.link;				
			}
			System.out.println(t.info);
		}
	}
	
	public static int count()
	{
		cll t=start;
		
		if(t==null)
		{
			return 0;
		}
		
		else
		{
			while(t.link!=start)
			{
				c++;
				t=t.link;
			}
		}
		
		return c+1;
	}
	
	public static void insert_at_front(int value)
	{
		cll t=start,y=start;
		
		cll x=new cll(value);
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t.link!=start)
			{
				t=t.link;
			}
			
			t.link=x;
			x.link=y;
			start=x;
		}
	}
	
	public static void insert_at_end(int value)
	{
		cll t=start,y=start;
		
		cll s=new cll(value);
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t.link!=start)
			{
				t=t.link;
			}
			
			t.link=s;			
			s.link=y;
		}
	}
	
	public static boolean search(int value)
	{
		cll t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t.link!=start)
			{
				if(t.info==value)
				{
					return true;
				}
				
				t=t.link;
			}
			
			if(t.info==value)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static void delete_at_front()
	{
		cll t=start,y=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t.link!=start)
			{
				t=t.link;
			}
			
			start=start.link;
			y.link=null;
			t.link=start;
			
			System.out.println("Deleted node= "+y.info);
		}
	}
	
	public static void delete_with_value(int value)
	{
		cll t=start;
		cll prev=null;
		
		if(t==null)
		{
			System.out.println("list is empty");
		}
		
		else
		{
			while(t.link!=start && t.info!=value)
			{
				prev=t;
				t=t.link;
			}
			
			if(t==start)
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
	
	public static void reverse()
	{
		cll t=start;
		cll prev=null;
		cll next=null;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			do
			{
				next=t.link;
				t.link=prev;
				prev=t;
				t=next;
			}while(t!=start);
			
			start.link=prev;
			start=prev;
			
			mov();	
		}
	}
	
	public static void mov()
	{
		cll t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t.link!=start)
			{
				System.out.print(t.info+" -> ");
				t=t.link;
			}
			System.out.print(r.info);
		}
	}
}
