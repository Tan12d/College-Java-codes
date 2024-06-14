
public class double_ll
{
	static class n
	{
		int info;
		n Llink;
		n Rlink;
		
		n(int info)
		{
			this.info=info;
			this.Llink=null;
			this.Rlink=null;
		}		
	}
	
	static n start=null;
	static n last=null;
	
	public static void main(String[] args)
	{
		start=new n(1);
		n a=new n(2);
		n b=new n(3);
		n c=new n(5);
		n d=new n(6);
		last=new n(7);
		
		start.Llink=null;
		start.Rlink=a;
		a.Llink=start;
		a.Rlink=b;
		b.Llink=a;
		b.Rlink=c;
		c.Llink=b;
		c.Rlink=d;
		d.Llink=c;
		d.Rlink=last;
		last.Llink=d;
		
		display();
		System.out.println();
		insert(4);
		display();
		
//		delete_start();
//		display();
		System.out.println();
		delete(6);
		display();
	}
	
	public static void display()
	{
		n t=start,y=last;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null)
			{
				System.out.print(t.info+" -> ");
				t=t.Rlink;
			}
			
//			System.out.println();
//			
//			while(y!=null)
//			{
//				System.out.print(y.info+" -> ");
//				y=y.Llink;
//			}
		}
	
	}
	
	public static void insert(int value)
	{
		n t=start;
		n prev=null;
		
		n f=new n(4);
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null && t.info<value)
			{
				prev=t;
				t=t.Rlink;				
			}
			
			if(t==null)
			{
				System.out.println("No");
			}
			
			else
			{
				prev.Rlink=f;
				f.Llink=prev;
				f.Rlink=t;
				t.Llink=f;
			}
		}
		
	}
	
	public static void delete_start()
	{
		n t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			start=start.Rlink;
			t.Rlink=null;
			
			System.out.println("\nDeleted node= "+t.info);
		}
	}
	
	public static void delete(int value)
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
				t=t.Rlink;
			}
			
			if(t==null)
			{
				System.out.println("list is empty");
			}
			
			else
			{
				prev.Rlink=t.Rlink;
				t.Rlink.Llink=prev;
			}
		}
	}

}
