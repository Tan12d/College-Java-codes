import java.util.*;

public class Circular_tour_petrolPump 
{
	private static ArrayDeque<Integer> Pump(int arr[][])
	{
		int nextPump=0;
		int n=arr.length;
		
		ArrayDeque<Integer> q=new ArrayDeque<Integer>();
		
		int petrol=0;
	
		while(q.size()!=n)
		{
			while(petrol>=0 && q.size()!=n)
			{
				q.add(nextPump);
				petrol += ( arr[nextPump][0]-arr[nextPump][1] );
				nextPump=(nextPump+1)%n;
			}
			
			while(petrol<0 && q.size()>0)
			{
				q.remove();
				petrol=-1;
			}
			
			petrol=0;
		}
		
		return q;
	}
		
	public static void main(String[] args) 
	{
		int arr[][]= {{8,6},{1,4},{7,3}};
		
		System.out.println(Pump(arr));
	}
}
