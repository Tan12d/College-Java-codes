import java.util.Stack;

public class sorted_insert_stack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(1);
		s.push(4);
		s.push(7);
		s.push(9);

		System.out.println(s);
 
		SortedInsert(s,5);
		
		System.out.println(s);
	}
	
	public static void SortedInsert(Stack<Integer> s,int val)
	{
		int t;
		
		if(s.isEmpty() || s.peek()<val)
		{
			s.push(val);
		}
		
		else
		{
			t=s.pop();
			SortedInsert(s,val);
			s.push(t);
		}
	}

}
