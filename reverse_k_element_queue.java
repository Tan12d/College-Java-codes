import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_k_element_queue
{
	public static void main(String[] args)
	{
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(12);
		q.add(3);
		q.add(78);
		q.add(99);
		
		System.out.println(q);
		
		reverse_k(q,2);
		
		System.out.println(q);

	}
	
	public static void reverse_k(Queue<Integer> q,int k)
	{
		Stack<Integer> s=new Stack<Integer>();
		
		int i=0;
		
		while(!q.isEmpty() && i<k)
		{
			s.push(q.remove());
			i++;
		}
		
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		
		int diff=q.size()-k;
		
		int t;
		
		while(diff>0)
		{
			t=q.remove();
			q.add(t);
			diff--;
		}
		
		
	}

}
