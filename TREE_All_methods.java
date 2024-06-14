import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TREE_All_methods
{
	static class yu
	{
		int info;
		yu llink;
		yu rlink;
		
		yu(int info)
		{
			this.info=info;
			this.llink=this.rlink=null;
		}
	}

	static yu start=null;
	static yu last=null;
	
	public static void main(String[] args)
	{
		start=new yu(29);
		yu a=new yu(16);
		yu b=new yu(24);
		yu c=new yu(12);
		yu d=new yu(14);
		yu e=new yu(22);
		last=new yu(20);
		
		start.llink=a;
		start.rlink=b;
		a.llink=c;
		a.rlink=d;
		b.llink=e;
		b.rlink=last;
		
		in(start);
		System.out.println();
		pre(start);
		System.out.println();
		post(start);
		System.out.println();
		bfs(start);
		System.out.println();
		dfs(start);
		System.out.println();
		System.out.println(count(start));
		int counter[]= {0};
		nth_pre(start,3,counter);
		int coter[]= {0};
		nth_in(start,5,coter);
		int coo[]= {0};
		nth_post(start,4,coo);
		System.out.println(add(start));
		System.out.println(count_leaf(start));
		int x=count(start);
		int y=count_leaf(start);
		System.out.println("Full nodes= "+(x-y));
		System.out.println();
		Stack<Integer> s=new Stack<Integer>();
		print_paths(s,start);
		System.out.println(isCompleteBT(start));
		System.out.println(isMinHeap(start));
		System.out.println(isMaxHeap(start));
		
	}
	
	public static void in(yu root)
	{
		if(root!=null)
		{
			in(root.llink);
			System.out.print(root.info+" ");
			in(root.rlink);
		}
	}
	
	public static void pre(yu root)
	{
		if(root!=null)
		{
			System.out.print(root.info+" ");
			pre(root.llink);
			pre(root.rlink);
		}
	}
	
	public static void post(yu root)
	{
		if(root!=null)
		{
			post(root.llink);
			post(root.rlink);
			System.out.print(root.info+" ");
		}
	}
	
	public static void bfs(yu root)
	{
		ArrayDeque<yu> q=new ArrayDeque<yu>();
		
		yu temp;
		
		if(root!=null)
		{
			q.add(root);
		}
		
		while(!q.isEmpty())
		{
			temp=q.remove();
			System.out.print(temp.info+" ");
			
			if(temp.llink!=null)
			{
				q.add(temp.llink);
			}
			
			if(temp.rlink!=null)
			{
				q.add(temp.rlink);
			}			
		}	
	}
	
	public static void dfs(yu root)
	{
		Stack<yu> s=new Stack<yu>();
		
		yu temp;
		
		if(root!=null)
		{
			s.push(root);
		}
		
		while(!s.isEmpty())
		{
			temp=s.pop();
			System.out.print(temp.info+" ");
		
			if(temp.llink!=null)
			{
				dfs(temp.llink);
			}
			
			if(temp.rlink!=null)
			{
				dfs(temp.rlink);
			}			
		}
	}
	
	public static int count(yu root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return (1+count(root.llink)+count(root.rlink));
	}
	
	public static void nth_pre(yu root,int index,int counter[])
	{
		if(root!=null)
		{
				counter[0]++;
				
				if(counter[0]==index)
				{
					System.out.println(root.info);
				}
				
				nth_pre(root.llink,index,counter);
				nth_pre(root.rlink,index,counter);			
		}
	}
	
	public static void nth_in(yu root,int index,int counter[])
	{
		if(root!=null)
		{
			nth_in(root.llink,index,counter);
			
			counter[0]++;
			
			if(counter[0]==index)
			{
				System.out.println(root.info);
			}
			
			nth_in(root.rlink,index,counter);
		}
	}
	
	public static void nth_post(yu root,int index,int coo[])
	{
		if(root!=null)
		{
			nth_post(root.llink,index,coo);
			nth_post(root.rlink,index,coo);
			
			coo[0]++;
			
			if(coo[0]==index)
			{
				System.out.println(root.info);
			}
		}
	}
	
	public static int add(yu root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return (root.info+add(root.llink)+add(root.rlink));
	}
	
	public static int count_leaf(yu root)
	{
		if(root==null)
		{
			return 0;
		}
		
		if(root.llink==null && root.rlink==null)
		{
			return 1;
		}
		
		else
		{
			return (count_leaf(root.llink)+count_leaf(root.rlink));
		}
	}
	
	public static void print_paths(Stack<Integer> s,yu root)
	{
		if(root==null)
		{
			return;
		}
		
		s.push(root.info);
		
		if(root.llink==null && root.rlink==null)
		{
			System.out.println(s);
			s.pop();
			return;
		}
		
		print_paths(s,root.rlink);
		print_paths(s,root.llink);
		
		s.pop();
	}
	
	public static boolean isCompleteBT(yu root)
	{
		if(root==null)
		{
			return true;
		}
		
		yu t;
		
		Queue<yu> q=new LinkedList<yu>();
		
		q.add(root);
		
		boolean flag=false;
		
		while(!q.isEmpty())
		{
			t=q.peek();
			q.remove();
			
			if(t==null)
			{
				flag=true;
			}
			
			else
			{
				if(flag==true)
				{
					return false;
				}
				
				isCompleteBT(root.llink);
				isCompleteBT(root.rlink);
			}			
		}		
		return true;
	}
	
	public static boolean isMinHeap(yu root)
	{
		int infi=Integer.MAX_VALUE;
		
		return (isCompleteBT(root) && isHeap(root,infi));		
	}
	
	public static boolean isHeap(yu root,int parent)
	{
		if(root==null)
		{
			return true;
		}
		
		if(root.info < parent)
		{
			return false;
		}
		
		return (isHeap(root.llink,root.info) && isHeap(root.rlink,root.info));
	}
	
	public static boolean isMaxHeap(yu root)
	{
		int infi=Integer.MAX_VALUE;
		
		return (isCompleteBT(root) && isHeapUtil(root,infi));
	}
	
	public static boolean isHeapUtil(yu root,int parent)
	{
		if(root==null)
		{
			return true;
		}
		
		if(root.info>parent)
		{
			return false;
		}
		
		return (isHeapUtil(root.llink,root.info) && isHeapUtil(root.rlink,root.info));
	}
}