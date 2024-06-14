
public class MAX_sum_noAdjacent
{
	public static void max_sum(int a[])
	{
		    int x = a[0];
	        int b = 0;
	        int b_new;
	        	 
	        for (int i = 1; i < a.length; i++) 
	        {
	            b_new = Math.max(x,b);
	            x = b + a[i];
	            b = b_new;
	        }
	 
	        System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		int a[]= {3,2,1,7,10};
		
		max_sum(a);
		
	}

}
