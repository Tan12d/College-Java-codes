import java.util.Stack;

public class Print_all_paths
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
	
		Stack<Integer> s=new Stack<Integer>();
		print_path(s,start);		
	}
	
	public static void print_path(Stack<Integer> s,bt root)
	{
		if(root==null)
		{
			return;
		}
		
		s.push(root.info);
		
		if(root.Rlink==null && root.Llink==null)
		{
			System.out.println(s);
			s.pop();
			return;
		}
		
		print_path(s,root.Rlink);
		print_path(s,root.Llink);
		
		s.pop();
	}
}
