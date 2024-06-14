
public class SLL
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
	
	public boolean containsloop()
	{
		Node fast=start;
		Node slow=start;
		
		while(fast!=null && fast.link!=null)
		{
			fast= fast.link.link;
			slow=slow.link;
			
			if(slow==fast)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static void create_loop()
	{
		Node first = new Node(10);		
		Node second= new Node(1);
		Node third= new Node(32);
		Node fourth=new Node(21);
		Node fifth=new Node(9);
		Node sixth=new Node(97);
		
		start=first;
		first.link=second;
		second.link=third;
		third.link=fourth;
		fourth.link=fifth;
		fifth.link=sixth;	
		sixth.link=third;
		
	}
	
	public static void main(String[] args) 
	{
		SLL s=new SLL();
		
		create_loop();
		
		System.out.println(s.containsloop());	
		
		System.out.println(start_of_loop().info);
		
		remove_loop();
		
		System.out.println(s.containsloop());
	}

	private static Node start_of_loop() 
	{
		Node slow=start;
		Node fast=start;
		
		while(fast!=null && fast.link!=null)
		{
			slow=slow.link;
			fast=fast.link.link;
			
			if(slow==fast)
			{
				return getstartingnode(slow);
			}
		}
		
		return null;		
	}
	
	private static Node getstartingnode(Node slow)
	{
		Node temp=start;
		
		while(slow!=temp)
		{
			temp=temp.link;
			slow=slow.link;
		}
		
		return temp;
	}

	private static void remove_loop() 
	{
		Node slow=start;
		Node fast=start;
		
		while(fast!=null && fast.link!=null)
		{
			slow=slow.link;
			fast=fast.link.link;
			
			if(slow==fast)
			{
				remove(slow);
				return;
			}
		}	
	}

	private static void remove(Node slow) 
	{
		Node t=start;
		
		while(slow.link!=t.link)
		{
			slow=slow.link;
			t=t.link;
		}
		
		slow.link=null;
	}

	
}
