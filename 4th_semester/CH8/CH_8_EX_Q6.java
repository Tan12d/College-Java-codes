import java.util.Stack;

public class CH_8_EX_Q6
{
	public static boolean same(Stack<Integer>s1,Stack<Integer>s2)
	{
		int flag=0;
		
		for(int i=0;i<s1.size();i++)
		{
			if(s1.get(i)!=s2.get(i))
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Stack<Integer> s1=new Stack<Integer>();
		
		s1.push(11);
		s1.push(90);
		s1.push(1);
		s1.push(74);
		
		Stack<Integer> s2=new Stack<Integer>();
		
		s2.push(12);
		s2.push(90);
		s2.push(1);
		s2.push(74);
		
		if(same(s1,s2))
		{
			System.out.println(true);
		}
		
		else
		{
			System.out.println(0);
		}
		
	}

}
