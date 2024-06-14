import java.util.Scanner;
import java.util.Stack;

public class reverse_of_number 
{
	public static char[] rev(String s)
	{
		Stack<Character> st=new Stack<Character>();
		
		char c[]=s.toCharArray();
		
		for(char i:c)
		{
			st.push(i);
		}
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=st.pop();
		}
		
		return c;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		String s=Integer.toString(n);
		
		System.out.println(rev(s));
		
		
//		char c[]=s.toCharArray();	
		
//		for(int i=c.length-1;i>=0;i--)
//		{
//			System.out.print(c[i]);
//		}

		
	}

}
