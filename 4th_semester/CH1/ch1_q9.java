import java.util.HashMap;
import java.util.HashSet;

public class ch1_q9 
{
	public static void main(String[] args)
	{
		int a[]= {3,8,4,2,1,9,7,5};
		
		System.out.println(smallest_missing(a));
	}
	
	public static int smallest_missing(int a[])
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		int large=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			h.put(a[i],1);
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}		
		
		for(int i=1;i<=large;i++)
		{
			if(!h.containsKey(i))
			{
				return i;
			}
		}
		
		return -1;		
	}

}
