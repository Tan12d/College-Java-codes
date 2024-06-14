class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
}

class BinaryTree
{
	public TreeNode create(int val)
	{
		TreeNode a=new TreeNode();
		a.data=val;
		a.left=null;
		a.right=null;
		
		return a;
	}	
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" -> ");
		inorder(root.right);
	}
	
	public void preorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data+" -> ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void postorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" -> ");
	}
	
	public int sumOfNodes(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return root.data+sumOfNodes(root.left)+sumOfNodes(root.right); 
	}
	
	public int getDifferenceEvenOddvalues(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return root.data-getDifferenceEvenOddvalues(root.left)-getDifferenceEvenOddvalues(root.right);
	}
	
	public int numberOfNodes(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
	}
}

public class BinaryTreeProgram 
{
	public static void main(String[] args) 
	{
		BinaryTree a=new BinaryTree();
		TreeNode root= a.create(2);
		root.left= a.create(7);
		root.right= a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);		
		
		System.out.println("Inorder Traversal:");
		a.inorder(root);
		System.out.println();
		
		System.out.println("PreOrder Traversal:");
		a.preorder(root);
		System.out.println();
		
		System.out.println("PostOrder Traversal:");
		a.postorder(root);
		System.out.println();
		
		System.out.println("Sum of nodes: " +a.sumOfNodes(root));
	
		System.out.println("Difference of values at Even & Odd level: " +a.getDifferenceEvenOddvalues(root));	

		System.out.println("Number of nodes: " +a.numberOfNodes(root));
	}
}
