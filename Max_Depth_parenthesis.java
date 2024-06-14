import java.util.Stack;

public class Max_Depth_parenthesis
{
	public static void main(String[] args) 
	{
		String s="{{{{}}}()()";
		
		System.out.println(check(s));
	}

	public static int check(String s)
	{
		Stack<Character> p=new Stack<Character>();
		
		char t[]=s.toCharArray();
		
		int depth=0,maxdepth=0;
		
		for(char i:t)
		{
			if(i=='(' || i==')')
			{
				if(i=='(')
				{
					depth++;
				}
				
				else if(i==')')
				{
					depth--;
				}
			}
			
			else if(i=='{' || i=='}')
			{
				if(i=='{')
				{
					depth++;
				}
				
				else if(i=='}')
				{
					depth--;
				}
			}
			
			else if(i=='[' || i==']')
			{
				if(i=='[')
				{
					depth++;
				}
				
				else if(i==']')
				{
					depth--;
				}
			}
			
			if(maxdepth<depth)
			{
				maxdepth=depth;
			}	
			
		}
		
		return maxdepth;
		
	}
}
