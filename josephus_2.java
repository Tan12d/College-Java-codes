import java.util.*;

public class josephus_2 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		
		ArrayDeque <Integer> q= new ArrayDeque<>();
		
		int t;
		
		for(int i: arr)
			q.add(i);
		
		while(q.size()!=1)
		{
			for(int i=0;i<2;i++)
			{
				t=q.peek();
				q.add(t);
				q.remove();
			}
			
			q.remove();
		}
		
		System.out.println("Surviving element is "+ q.peek());
	
	}

}