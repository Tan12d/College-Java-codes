import java.util.Stack;

public class ASS_2_Q3
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();

		int n=13;
		
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
