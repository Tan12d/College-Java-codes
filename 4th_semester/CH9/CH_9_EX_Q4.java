import java.util.ArrayDeque;

public class CH_9_EX_Q4
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
		start=new bt(6);
		bt a=new bt(4);
		bt b=new bt(8);
		bt c=new bt(2);
		bt d=new bt(5);
		bt e=new bt(7);
		bt f=new bt(9);
		bt g=new bt(1);
		bt h=new bt(3);
		last=new bt(10);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=f;
		c.Llink=g;
		c.Rlink=h;
		f.Rlink=last;
		
		dfs(start);

	}
	
	public static void dfs(bt root)
	{
		ArrayDeque<bt> q=new ArrayDeque<bt>();
		
		if(root!=null)
		{
			q.add(root);
		}
			
		while(!q.isEmpty())
		{
			bt t=q.pop();
			System.out.print(t.info+" ");
			
			if(t.Llink!=null)
			{
				q.add(t.Llink);
			}
			
			if(t.Rlink!=null)
			{
				q.add(t.Rlink);
			}
		}
	}
	
}
