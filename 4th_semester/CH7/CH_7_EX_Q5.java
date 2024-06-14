import java.util.Stack;
 
public class CH_7_EX_Q5
{
    public static boolean isOperator(char x)
	{
		switch(x)
	    {
	        case '+':
	        case '-':
	        case '*':
	        case '/':
	        case '^':
	        case '%':
	            return true;
	    }
	    return false;
	}
 
	public static String convert(String str)
	{
		Stack<String> stack = new Stack<String>();
     
		for(int i = str.length()-1; i >= 0; i--)
		{
			if (isOperator(str.charAt(i)))
			{
				String op1 = stack.pop();
				String op2 = stack.pop();
             
				stack.push("(" + op1 + str.charAt(i) + op2 + ")");
			}
			
			else
			{
            	stack.push(str.charAt(i) + "");
			}
		}
		
		return stack.peek();
	}
 
	public static void main(String[] args)
	{
		String exp = "*-A/BC-/AKL";
		System.out.println("Infix : " + convert(exp));
	}
}
