import java.util.Stack;

class tnode
{
	int info;
	tnode left;
	tnode right;
	
	tnode(int info)
	{
		this.info=info;
	}
}

public class Binary_tree
{
	static tnode root=null;
	
	public static void create()
	{
		tnode first=new tnode(44);
		tnode second=new tnode(32);
		tnode third=new tnode(52);
		tnode fourth=new tnode(96);
		tnode fifth=new tnode(4);
		tnode sixth=new tnode(13);
		tnode seventh=new tnode(67);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=sixth;
		third.right=seventh;	
	}
	
	public static void Recursive_preOrder_traversal(tnode root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.info+" ");
		Recursive_preOrder_traversal(root.left);
		Recursive_preOrder_traversal(root.right);		
	}
	
	public static void Iterative_preOrder_traversal(tnode root)
	{
		if(root==null)
		{
			return;
		}
		
		else
		{
			Stack<tnode> s=new Stack<tnode>();
			
			s.push(root);
			
			while(!s.isEmpty())
			{
				tnode temp=s.pop();				
				System.out.print(temp.info+" ");
				
				if(temp.right!=null)
				{
					s.push(temp.right);
				}
					
				if(temp.left!=null)
				{
					s.push(temp.left);
				}
			}	
		}
	}
	
	public static void Recursive_inOrder_traversal(tnode root)
	{
		if(root==null)
		{
			return;
		}
		
		Recursive_inOrder_traversal(root.left);
		System.out.print(root.info+" ");		
		Recursive_inOrder_traversal(root.right);		
	}
	
	public static void Iterative_inOrder_traversal(tnode root)
	{
		if(root==null)
		{
			return;
		}
		
		else
		{
			Stack<tnode> s=new Stack<tnode>();
			
			tnode temp=root;
			
			while(!s.isEmpty() || temp!=null)
			{
				if(temp!=null)
				{
					s.push(temp);
					temp=temp.left;
				}
				
				else
				{
					temp=s.pop();
					System.out.print(temp.info+" ");
					temp=temp.right;
				}
			}
		}
	}
	
	public static void Recursive_postOrder_traversal(tnode root)
	{
		if(root==null)
		{
			return;
		}
		
		Recursive_postOrder_traversal(root.left);
		Recursive_postOrder_traversal(root.right);	
		System.out.print(root.info+" ");	
	}
	
	public static void Iterative_postOrder_traversal(tnode root)
	{
		if(root==null)
		{
			return;
		}
		
		else
		{
			tnode current=root;
			
			Stack<tnode> su=new Stack<tnode>();
			
			while(!su.isEmpty() || current!=null)
			{
				if(current!=null)
				{
					su.push(current);
					current=current.left;					
				}
				
				else
				{
					tnode temp= su.peek().right;
					
					if(temp==null)
					{
						temp=su.pop();
						System.out.print(temp.info+" ");
						
						while(!su.isEmpty() && temp==su.peek().right)
						{
							temp=su.pop();
							System.out.print(temp.info+" ");
						}
					}
					
					else
					{
						current=temp;
					}
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		 create();
		 
//		 Recursive_preOrder_traversal(root);		 
//		 System.out.println();		 
//		 Iterative_preOrder_traversal(root);
		 
//		 Recursive_inOrder_traversal(root);		 
//		 System.out.println();		 
//		 Iterative_inOrder_traversal(root);
		 
		 Recursive_postOrder_traversal(root);
		 System.out.println();
		 Iterative_postOrder_traversal(root);
	}

}
