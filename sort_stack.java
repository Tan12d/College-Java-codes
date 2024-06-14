import java.util.Stack;

public class sort_stack 
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();

		s.push(78);
		s.push(12);
		s.push(53);
		s.push(89);
		
		System.out.println(s);
		
		sort(s);
		
		System.out.println(s);
	}
	
	public static void sort(Stack<Integer> s)
	{
		int t;
		
		Stack<Integer> s1=new Stack<Integer>();
		
		while(!s.isEmpty())
		{
			t=s.pop();
			
			while(!s1.isEmpty() && s1.peek()<t)
			{
				s.push(s1.pop());
			}
			
			s1.push(t);
		}
		
		while(!s1.isEmpty())
		{
			s.push(s1.pop());
		}
	}

}
