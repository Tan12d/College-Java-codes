import java.util.Stack;

public class CH_7_EX_Q1 
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();

		int n=15;
		
		while(n>0)
		{
			s.add(n%2);
			n/=2;
		}
		
		for(int i=s.size()-1;i>=0;i--)
		{
			System.out.print(s.get(i)+" ");
		}
	}

}
