import java.util.LinkedList;
import java.util.Queue;

public class CH_8_EX_Q3 
{
	static Queue<Integer> q=new LinkedList<Integer>();
	
	public static void push(int data)
	{
		q.add(data);
		
		for(int i=0;i<q.size();i++)
		{
			int x=q.remove();
			q.add(x);
		}
	}
	
	public static int pop()
	{
		if(q.isEmpty())
		{
			return -1;
		}
		
		else
		{
			int x=q.remove();
			return x;
		}
	}
	
	public static void peek()
	{
		if(q.isEmpty())
		{
			System.out.println("Stack is empty");
		}
		
		else
		{
			System.out.println(q.peek());
		}
	}
	
	public static void main(String[] args) 
	{
		push(88);
		push(23);
		push(2);
		System.out.println(q);
		
		System.out.println(pop());
		
		peek();
		
		
	}

}
