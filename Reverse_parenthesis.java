import java.util.Stack;

public class Reverse_parenthesis 
{
	public static void main(String[] args) 
	{
		String s=")(())(((";
		
		System.out.println(rev(s));
	}
	
	public static int rev(String s)
	{
		Stack<Character> p=new Stack<Character>();
		
		char c[]=s.toCharArray();
		
		int opencount=0,closecount=0;
		
		if(c.length%2==1)
		{
			System.out.println("Invalid odd length");
			return -1;
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				p.push('(');
			}
			
			else if(c[i]==')')
			{
				if(p.size()!=0 && p.peek()=='(')
				{
					p.pop();
				}
				
				else
				{
					p.push(')');
				}
			}
		}
		
		while(p.size()!=0)
		{
			if(p.pop()=='(')
			{
				opencount++;
			}
			
			else
			{
				closecount++;
			}
		}
		
		return (int)Math.ceil(opencount/2.0)+ (int)Math.ceil(closecount/2.0);
	}

}
