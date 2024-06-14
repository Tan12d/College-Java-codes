
public class Number_of_Full_nodes 
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
		start=new bt(5);
		bt a=new bt(7);
		bt b=new bt(9);
		bt c=new bt(6);
		bt d=new bt(2);
		bt e=new bt(18);
		last=new bt(4);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=last;
		
		int x=count(start);
		int y=count_leaf_nodes(start);
		
		System.out.println("Full nodes= "+(x-y));
		
	}
	
	public static int count(bt root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return (1+count(root.Rlink)+count(root.Llink));
	}
	
	public static int count_leaf_nodes(bt root)
	{
		if(root==null)
		{
			return 0;
		}
		
		if(root.Rlink==null && root.Llink==null)
		{
			return 1;
		}
		
		else
		{
			return(count_leaf_nodes(root.Rlink)+count_leaf_nodes(root.Llink));
		}
	}
	

}
