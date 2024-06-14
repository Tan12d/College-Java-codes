import java.util.Stack;

public class Parenthesis_count 
{
	public static void main(String[] args) 
	{
		String s="(((a+(b))+(c+d)))";
		
		paren_count(s);
		
	}

	public static void paren_count(String s)
	{
		Stack<Integer> p=new Stack<Integer>();
		
		char c[]=s.toCharArray();
		
		String output=new String();
		
		int count=1;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				p.push(count);
				output+=count;
				count++;
			}
			
			else if(c[i]==')')
			{
				output+=p.pop();				
			}
		}
		
		System.out.println(output);
	}
}
