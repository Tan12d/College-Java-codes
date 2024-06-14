import java.util.Stack;

public class Queue_using_stack
{
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>();
	
	public static void add(int value)
	{
		s1.push(value);
	}
	
	public static int remove()
	{
		int value;
		
		if(s2.isEmpty()==false)
		{
			return s2.pop();
		}
		
		while(s1.isEmpty()==false)
		{
			value=s1.pop();
			s2.push(value);
		}
		
		return s2.pop();
	}

	
	public static void main(String[] args) 
	{
		Queue_using_stack q=new Queue_using_stack();
		
		add(7);
		add(77);
		add(777);
		
		System.out.println(s1);
		
		System.out.println(remove());
		System.out.println(remove());

	}

}
