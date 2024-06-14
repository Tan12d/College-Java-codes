

public class merge_sortedlinkedlists
{
	private N start;
	
	private static class N
	{
		private int info;
		private N link;
		
		public N(int info)
		{
			this.info= info;
			this.link= null;
		}
	}
	
	public static void main(String[] args) 
	{
		merge_sortedlinkedlists a=new merge_sortedlinkedlists();
		
//	    a.insert_at_end(21);
//	    a.insert_at_end(32);
//	    a.insert_at_end(45);
//	    a.insert_at_end(65);
//	    a.insert_at_end(78);
		
		a.insert_at_end(7);
	    a.insert_at_end(4);
	    a.insert_at_end(9);
	    
	    merge_sortedlinkedlists b=new merge_sortedlinkedlists();
		
	    b.insert_at_end(5);
	    b.insert_at_end(6);
	    
	    a.display();
	    b.display();
	  
	    merge_sortedlinkedlists results=new merge_sortedlinkedlists();
	    merge_sortedlinkedlists r=new merge_sortedlinkedlists();
	    
//	    results.start= merge(a.start,b.start);
//	    results.display();
	    
	    r.start= add_linkedlists(a.start,b.start);
	    r.display();    
	}

	public void insert_at_end(int data)
	{
		N n=new N(data);
		
		if(start==null)
		{
		
			start=n;
			return;
		}
		
			N t=start;
			
			while(t.link!=null)
			{
				t=t.link;
			}
			
			t.link=n;
			
	
	}
	
	public static N merge(N a,N b)
	{
		N dummy= new N(0);
		
		N tail=dummy;
		
		while(a!=null && b!=null)
		{
			if(a.info<b.info)
			{
				tail.link=a;
				a=a.link;
			}
			
			else
			{
				tail.link=b;
				b=b.link;
			}
			
			tail=tail.link;
		}
		
		if(a==null)
		{
			tail.link=b;
		}
		
		else
		{
			tail.link=a;
		}
		
		return dummy.link;
	}
	
	public static N add_linkedlists(N a,N b)
	{
		N dummy= new N(0);
		
		N tail=dummy;
		
		int carry=0;
		
		while(a!=null || b!=null)
		{
			int x= (a!=null)? a.info: 0;
			int y= (b!=null)? b.info: 0;
			
			int sum= carry+x+y;
			
			carry= sum/10;
			
			tail.link=new N(sum%10);
			tail=tail.link;
			
			if(a!=null)
			{
				a=a.link;
			}
			
			if(b!=null)
			{
				b=b.link;
			}
		}
	
		if(carry > 0)
		{
			tail.link=new N(carry);
		}
		
		return dummy.link;
	}
	
	public void display()
	{
		N t=start;
		
		while(t!=null)
		{
			System.out.print(t.info+" --> ");
			t=t.link;
		}
		System.out.println("null");
	}

}
