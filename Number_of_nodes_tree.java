
public class Number_of_nodes_tree
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
		
		System.out.println("Total no.of nodes= "+count(start));
		
		System.out.println("No.of nodes in right= " +r_count(start));
		
		System.out.println("No.of nodes in left= " +l_count(start));
	}
	
	public static int count(bt root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return (1+count(root.Rlink)+count(root.Llink));
	}
	
	public static int r_count(bt root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return (count(root.Rlink));
	}
	
	public static int l_count(bt root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return (count(root.Llink));
	}

}
