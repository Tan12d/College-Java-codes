public class SinglyLinkedList
{
	private static class Node
	{
		private int info;
		private Node link;
		
		public Node(int info)
		{
			this.info= info;
			this.link= null;
		}
	}
	
	private static Node start=null;
	
	public static void main(String[] args) 
	{
		SinglyLinkedList s=new SinglyLinkedList();
		
		start = new Node(10);		
		Node second= new Node(1);
		Node third= new Node(32);
		Node fourth=new Node(21);
		Node fifth=new Node(9);
		
		start.link=second;
		second.link=third;
		third.link=fourth;
		fourth.link=fifth;
		fifth.link=null;
		
		s.display();
	}
	
	public void display()
	{
		Node t=start;
		
		while(t!=null)
		{
			System.out.print(t.info+" --> ");
			t=t.link;
		}
	}

}
