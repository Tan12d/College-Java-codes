
public class ch1_q5 
{

	public static void main(String[] args) 
	{
		int a[]= {4,-6,9,3,8,-5,-4,-2};
		
		System.out.println(sum_array(a));
	}
	
	public static int sum_array(int a[])
	{
		int currsum=0,maxsum=0;
		
		for(int i=0;i<a.length;i++)
		{
			currsum+=a[i];
			
			if(currsum<0)
			{
				currsum=0;
			}
			
			if(maxsum<currsum)
			{
				maxsum=currsum;				
			}		
		}
		
		return maxsum;	
	}

}
