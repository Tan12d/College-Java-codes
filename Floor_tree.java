
public class Floor_tree
{
	static class bt
	{
		int info;
		bt Llink;
		bt Rlink;
		
		bt(int info)
		{
			this.info=info;
			this.Llink=null;
			this.Rlink=null;
		}
	}
	
	static bt start=null;
	static bt last=null;
	
	public static void main(String[] args) 
	{
		start=new bt(20);
		bt a=new bt(18);
		bt b=new bt(22);
		bt c=new bt(12);
		bt d=new bt(19);
		bt e=new bt(21);
		last=new bt(24);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=last;
		
		System.out.println(floor(23));
	}	
	
	public static int floor(int value)
	{
		bt t=start;
		int floo_r=Integer.MAX_VALUE;
		
		while(t!=null)
		{
			if(t.info==value)
			{
				floo_r=t.info;
				break;
			}
			
			else if(t.info<value)
			{
				floo_r=t.info;
				t=t.Rlink;				
			}
			
			else
			{
				t=t.Llink;
			}
		}
		
		return floo_r;
	}
	
}
