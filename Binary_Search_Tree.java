import java.util.Stack;

public class Binary_Search_Tree 
{
	static class tn
	{
		int info;
		tn llink;
		tn rlink;
		
		tn(int info)
		{
			this.info=info;
			this.llink=null;
			this.rlink=null;
		}
	}
	
	public tn add(tn root,int info)
	{
		if(root==null)
		{
			root=new tn(info);
		}
		
		if(info<root.info)
		{
			root.llink=add(root.llink,info);
		}
		
		else if(info>root.info)
		{
			root.rlink=add(root.rlink,info);
		}
		
		return root;
	}
	
	public void inorder(tn root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.llink);
		System.out.print(root.info+" ");
		inorder(root.rlink);	
	}
	
	public int findMax(tn root)
	{
		while(root.rlink!=null)
		{
			root=root.rlink;
		}
		
		return root.info;
	}
	
	public int findMin(tn root)
	{
		while(root.llink!=null)
		{
			root=root.llink;
		}
		
		return root.info;
	}
	
	public boolean search(tn root,int value)
	{
		if(root.info<value)
		{
			while(root.rlink!=null)
			{
				if(root.info==value)
				{
					return true;
				}
				
				root=root.rlink;
			}
		}
		
		else if(root.info>value)
		{
			while(root.llink!=null)
			{
				if(root.info==value)
				{
					return true;
				}
				
				root=root.llink;
			}
		}
		
		else
		{
			return true;
		}
		
		return false;
	}
	
	public int ceil(tn root,int value)
	{
		tn t=root;
		
		int ce_il=Integer.MIN_VALUE;
		
		while(t!=null)
		{
			if(t.info>value)
			{
				ce_il=t.info;
				t=t.llink;
			}
			
			else if(t.info<value)
			{
				t=t.rlink;
			}
			
			else
			{
				ce_il=t.info;
				break;
			}
		}
		
		return ce_il;
	}
	
	public int floor(tn root,int value)
	{
		tn t=root;
		
		int floo_r=Integer.MAX_VALUE;
		
		while(t!=null)
		{
			if(t.info<value)
			{
				floo_r=t.info;
				t=t.rlink;
			}
			
			else if(t.info>value)
			{
				t=t.llink;
			}
			
			else
			{
				floo_r=t.info;
				break;
			}
		}
		
		return floo_r;
	}
	
	public boolean isBST(tn root)
	{
		if(root==null)
		{
			return true;
		}
		
		if(root.llink!=null && findMax(root.llink)>root.info)
		{
			return false;
		}
		
		if(root.rlink!=null && findMin(root.rlink)<=root.info)
		{
			return false;
		}
		
		return (isBST(root.llink) && isBST(root.rlink));
	}
	
	private tn delete(tn root,int val)
	{
		if(val<root.info)
		{
			root.llink=delete(root.llink,val);
		}
			
		else if(val>root.info)
		{
			root.rlink=delete(root.rlink,val);
		}
			
		else 
		{
			if(root.rlink==null && root.llink==null)
				return null;
	
			else if(root.rlink==null)
				return root.llink;
			
			else if(root.llink==null)
				return root.rlink;
			
			tn IS=Inordersuccessor(root.rlink);
			root.info=IS.info;
			root.rlink=delete(root.rlink,IS.info);
		}
		return root;
	}
	
	private tn Inordersuccessor(tn root)
	{
		while(root.llink!=null)
			root=root.llink;
		
		return root;
	}
	
	public boolean isBSTArray(int a[],int n)
	{
		Stack<Integer> s=new Stack<Integer>();
		
		int value;
		int root=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			value=a[i];
			
			if(value<root)
			{
				return false;
			}
			
			while(s.size()>0 && s.peek()<value)
			{
				root=s.pop();
			}
			
			s.push(value);
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		tn root=null;
		
		Binary_Search_Tree t = new Binary_Search_Tree();
		
		int a[]= {5,6,4,2,1,9};
		
		int b[]= {1,2,3,4,5,6,7,8,9};
				
		for(int i=0;i<a.length;i++)
		{
			root=t.add(root,a[i]);
		}
		
		t.add(root,7);
		t.inorder(root);	
		System.out.println();
		System.out.println(t.findMax(root));
		System.out.println(t.findMin(root));
		System.out.println(t.search(root,12));
		System.out.println(t.ceil(root,8));
		System.out.println(t.floor(root,3));
		System.out.println(t.isBST(root));
		System.out.println(t.isBSTArray(b,b.length));
		System.out.println(t.delete(root, 4));
		t.inorder(root);
	}
}
