import java.util.ArrayDeque;
import java.util.Stack;

public class reverse_k_element_stack 
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();

		s.push(78);
		s.push(12);
		s.push(53);
		s.push(89);
		
		System.out.println(s);
		
		reverse_k(s,3);
		
		System.out.println(s);
	}
	
	public static void reverse_k(Stack<Integer> s,int k)
	{
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		
		int i=0;
		
		while(!s.isEmpty() && i<k)
		{
			a.add(s.pop());
			i++;
		}
		
		while(!a.isEmpty())
		{
			s.push(a.remove());
		}
		
	}

}
