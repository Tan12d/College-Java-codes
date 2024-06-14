import java.util.Stack;

public class CH_7_EX_Q2 
{
	static boolean isOperator(char c) 
	{
		switch(c)
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

	public static int getPriority(char C)
	{
		if (C == '-' || C == '+')
			return 1;
	
		else if (C == '*' || C == '/' || C == '%')
			return 2;
		
		else if (C == '^')
			return 3;
		
		return 0;
	}

	public static String infixToPrefix(String s) 
	{
		Stack<Character> operators = new Stack<Character>();

		Stack<String> operands = new Stack<String>();

		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '(') 
			{
				operators.push(s.charAt(i));
			} 
			
			else if (s.charAt(i) == ')') 
			{
				while (!operators.empty() && operators.peek() != '(')
				{
					String op1 = operands.pop();

					String op2 = operands.pop();

					char op = operators.pop();

					String tmp = op + op2 + op1;
					operands.push(tmp);
				}

				operators.pop();
			}

			else if (!isOperator(s.charAt(i))) 
			{
				operands.push(s.charAt(i) + "");
			}
			
			else 
			{
				while (!operators.empty() && getPriority(s.charAt(i))<= getPriority(operators.peek())) 
				{
					String op1 =operands.pop();

					String op2 =operands.pop();

					char op =operators.pop();

					String tmp = op + op2 + op1;
					operands.push(tmp);
				}

				operators.push(s.charAt(i));
			}
		}

		while (!operators.empty()) 
		{
			String op1 = operands.pop();

			String op2 = operands.pop();

			char op = operators.pop();

			String tmp = op + op2 + op1;
			operands.push(tmp);
		}
		
		return operands.peek();
	}

	public static void main(String args[]) 
	{
		String s = "(A-B/C)*(A/K-L)";
		System.out.println(infixToPrefix(s));
		String s1=infixToPrefix(s);
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
	}
}