import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CH_8_EX_Q4 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(12);
		s.push(23);
		s.push(11);
		s.push(3);
		
		System.out.println(s);
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		
		System.out.println(q);
		
	}

}
