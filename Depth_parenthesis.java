import java.util.Stack;

public class Depth_parenthesis 
{
	public static void main(String[] args) 
	{
		String s="((((A)))((((BBB()))))()()()())";
		
		System.out.println(dep(s));
	}
	
	public static int dep(String s)
	{
		char c[]=s.toCharArray();
		
		Stack<Character> p=new Stack<Character>();
		
		int depth=0,max=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				p.push(c[i]);
				depth++;
			}
			
			else if(c[i]==')')
			{
				p.pop();
				depth--;
			}
			
			if(depth>max)
			{
				max=depth;
			}
		}
		
		return max;
	}

}
