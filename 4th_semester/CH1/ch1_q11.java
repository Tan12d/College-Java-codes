
public class ch1_q11
{
	public static void main(String[] args)
	{
		int a[]= {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println(max_circular_sum(a,a.length));
	}
	
	public static int max_circular_sum(int a[],int size)
	{
		int sumAll=0,currsum=0,maxsum=0;
		
		for(int i=0;i<size;i++)
		{
			sumAll+=a[i];
			currsum+=i*a[i];
		}
		
		maxsum=currsum;
		
		for(int i=0;i<size;i++)
		{
			currsum=(currsum+sumAll)-(size*a[size-i]);
			
			if(currsum>maxsum)
			{
				maxsum=currsum;
			}
		}
		
		return maxsum;
	}

}
