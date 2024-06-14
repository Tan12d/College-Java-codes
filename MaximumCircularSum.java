
public class MaximumCircularSum 
{
	public static int sum(int a[])
	{
		int sum_all=0;
		int cir_sum=0;
		int maxsum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum_all+=a[i];
			cir_sum+=i*a[i];
		}
		
		maxsum=cir_sum;
		
		for(int i=1;i<a.length;i++)
		{
			cir_sum=(cir_sum+sum_all)-(a.length*a[a.length-i]);
			
			if(cir_sum>maxsum)
			{
				sum_all=maxsum;
			}
		}
		
		return maxsum;
		
	}
	
	public static void main(String[] args) 
	{
		int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println(sum(a));
	}

}
