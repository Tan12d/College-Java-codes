import java.util.Stack;

public class bottom_insert_stack 
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();

		s.push(78);
		s.push(12);
		s.push(53);
		s.push(89);
		
		System.out.println(s);
		
		bot_ins(s,4);
		
		System.out.println(s);
	}
	
	public static void bot_ins(Stack<Integer> s,int val)
	{
		s.add(s.size(),val);
	}

}
