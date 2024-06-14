public class Maximum_sum_subarray 
{
	public static int kadane_algorithm(int []b)
	{
		int maxsum=0;
		int currsum=0;
		
		for(int i=0;i<b.length;i++)
		{
			currsum += b[i];
			
			if(currsum>maxsum)
			{
				maxsum=currsum;
			}
			
			if(currsum<0)
			{
				currsum=0;
			}
		}
		
		return maxsum;
	}
	
	public static void main(String[] args) 
	{
		int a[]= {-3,8,-1,-5,3,5,6,-9};
		
		System.out.println(kadane_algorithm(a));
	}
}
