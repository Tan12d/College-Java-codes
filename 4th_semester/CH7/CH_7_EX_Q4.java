import java.util.Stack;

public class CH_7_EX_Q4
{
     public static boolean isOperand(char x)
	{
		return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
	}
 
	public static String getInfix(String exp)
	{
		Stack<String> s = new Stack<String>();
 
		for (int i = 0; i < exp.length(); i++)
		{
			if (isOperand(exp.charAt(i)))
			{
				s.push(exp.charAt(i) + "");
			}
 
			else
			{
				String op1 =s.pop();
				String op2 =s.pop();
				
				s.push("(" + op2 + exp.charAt(i) + op1 + ")");
			}
		} 
		return s.peek();
	}

	public static void main(String args[])
	{
		String exp = "ab*c+";
		System.out.println(getInfix(exp));
	}
}