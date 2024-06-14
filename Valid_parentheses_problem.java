import java.util.Stack;

public class Valid_parentheses_problem
{
	public static boolean isValid(String s)
	{
		Stack<Character> st=new Stack<Character>();
		
		char c[]=s.toCharArray();
		
		for(char ch:c)
		{
			if(ch=='('||ch=='{'||ch=='[')
			{
				st.push(ch);
			}
			
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				
				else
				{
					char top=st.peek();
					
					if((ch=='}' && top=='{')||(ch==')' && top=='(')||(ch==']' && top=='['))
					{
						st.pop();
					}
					
					else
					{
						return false;
					}
				}
			}
		}
		
		return st.isEmpty();
		
	}
	
	public static void main(String[] args) 
	{
		String s="[{()}]";
		
	    System.out.println(isValid(s));
	}

}
