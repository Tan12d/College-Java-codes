import java.util.Stack;

public class next_greater_element
{
	public static void greaterElement(int a[])
	{
		int res[]=new int[a.length];
		
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(!s.isEmpty())
			{
				while(!s.isEmpty() && s.peek()<=a[i])
				{
					s.pop();
				}
			}
			
			if(s.isEmpty())
			{
				res[i]=-1;				
			}
			
			else
			{
				res[i]=s.peek();
			}
			
			s.push(a[i]);
		}
		
		for(int l:res)
		{
			System.out.print(l+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]= {4,7,3,4,8,1};
		
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		
		System.out.println();
		
		greaterElement(a);
	}

}
