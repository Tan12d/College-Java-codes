import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CH_8_EX_Q5 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(23);
		q.add(90);
		q.add(1);
		q.add(54);
		
		System.out.println(q);
		
		Stack<Integer> s=new Stack<Integer>();
	
		while(!q.isEmpty())
		{
			s.push(q.remove());
		}
		
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		
		System.out.println(q);
	}

}
