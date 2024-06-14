import java.util.Stack;

public class Balanced_Parenthesis 
{
	public static void main(String[] args) 
	{
		String s="[{()}]";
		
		System.out.println(verify(s));
	}
	
	public static boolean verify(String s)
	{
		Stack<Character> p=new Stack<Character>();
		
		for(char ch:s.toCharArray())
		{
			switch(ch)
			{
			case '[':
			case '{':
			case '(':
				p.push(ch);
				break;
			case ')':
				if(p.pop()!='(')
				{
					return false;
				}
				break;
			case '}':
				if(p.pop()!='{')
				{
					return false;
				}
				break;
			case ']':
				if(p.pop()!='[')
				{
					return false;
				}
				break;
			}
		}
		
		return p.isEmpty();
	}

}
