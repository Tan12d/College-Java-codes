import java.util.Stack;

public class reverse_a_string_using_stack
{
	public static char[] reverse(String str)
	{
		Stack<Character> s=new Stack<Character>();
		
		char ch[]=str.toCharArray();
		
		for(char i:ch)
		{
			s.push(i);
		}
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=s.pop();
		}
		
		return ch;
	}
	
	public static void main(String[] args)
	{
		String str="ABCD";
		
		System.out.println(reverse(str));
	}
}