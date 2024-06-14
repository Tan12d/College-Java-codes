import java.util.Stack;

public class CH_7_EX_Q3 
{
	public static boolean balance(String s)
	{
		Stack<Character> h=new Stack<Character>();
		
		for(char c:s.toCharArray())
		{
			switch(c)
			{
			case '[':
			case '{':
			case '(':
				h.push(c);
				break;
			case ']':
				if(h.pop()!='[')
				{
					return false;
				}
				break;
			case '}':
				if(h.pop()!='{')
				{
					return false;
				}
				break;
			case ')':
				if(h.pop()!='(')
				{
					return false;
				}
				break;
			}
		
		}
		
		return h.isEmpty();
	}
	
	public static void main(String[] args) 
	{
		String s="({[]})";
		
		System.out.println(balance(s));
	}

}
