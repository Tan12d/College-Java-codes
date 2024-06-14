import java.util.Stack;

public class BST_ALL_methods
{
	static class t
	{
		int info;
		t l;
		t r;
		
		t(int info)
		{
			this.info=info;
			this.r=null;
			this.l=null;
		}
	}
	
	public t add(t root,int info)
	{
		if(root==null)
		{
			root=new t(info);
		}
		
		if(info<root.info)
		{
			root.l=add(root.l,info);
		}
		
		else if(info>root.info)
		{
			root.r=add(root.r,info);
		}
		
		return root;
	}
	
	public void in(t root)
	{
		if(root==null)
		{
			return;
		}
		
		else
		{
			in(root.l);
			System.out.print(root.info+" ");
			in(root.r);
		}
	}
	
	public int min(t root)
	{
		t y=root;
		
		while(y.l!=null)
		{
			y=y.l;
		}
		
		return y.info;
	}
	
	public int max(t root)
	{
		t y=root;
		
		while(y.r!=null)
		{
			y=y.r;
		}
		
		return y.info;
	}
	
	public int ceil(t root,int val)
	{
		t y=root;
		
		int ce_il=Integer.MIN_VALUE;
		
		while(y!=null)
		{
			if(y.info==val)
			{
				ce_il=y.info;
				break;
			}
			
			else if(y.info<val)
			{				
				y=y.r;
			}
			
			else
			{
				ce_il=y.info;
				y=y.l;
			}
		}
		
		return ce_il;
	}
	
	public int floor(t root,int info)
	{
		t y=root;
		
		int f=Integer.MAX_VALUE;
		
		while(y!=null)
		{
			if(y.info==info)
			{
				f=y.info;
				break;
			}
			
			else if(y.info<info)
			{
				f=y.info;
				y=y.r;
			}
			
			else
			{
				y=y.l;
			}
		}
		
		return f;
	}
	
	public boolean isBST(t root)
	{
		if(root==null)
		{
			return true;
		}
		
    	if(root.l!=null && max(root.l)>root.info)
    	{
    		return false;
    	}
    	
    	if(root.r!=null && min(root.r)<=root.info)
    	{
    		return false;
    	}
    	
    	return (isBST(root.l) && isBST(root.r));
	}

	public boolean isBSTarray(int b[],int n)
	{
		Stack<Integer> s=new Stack<Integer>();
		
		int value;
		int root=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			value=b[i];
			
			if(value<root)
			{
				return false;
			}
			
			while(s.size()>0 && s.peek()>value)
			{
				root=s.pop();
			}
			
			s.push(value);
		}
		
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		t root=null;
		
		BST_ALL_methods a=new BST_ALL_methods();
		
		int b[]= {4,6,8,5,1,7};
		
		for(int i=0;i<b.length;i++)
		{
			root=a.add(root,b[i]);
		}
		
		a.in(root);
		
		a.add(root,10);
		System.out.println();
		a.in(root);
		System.out.println();
		System.out.println(a.min(root));
		System.out.println(a.max(root));
		System.out.println(a.ceil(root,9));
		System.out.println(a.floor(root,2));
		System.out.println(a.isBST(root));	
		System.out.println(a.isBSTarray(b,b.length));

	}

}
