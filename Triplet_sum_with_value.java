import java.util.Arrays;

public class Triplet_sum_with_value
{
	public static void main(String[] args) 
	{
		int a[]= {2,-1,9,0,4,2,6};
		
		Arrays.sort(a);
		
		int value=8;
		
		for(int i=0;i<a.length-2;i++)
		{
			int j=i+1;
			int k=a.length-1;
			
			while(j<k)
			{
				if((a[i]+a[j]+a[k])==value)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					j++;
					k--;
				}
				
				else if((a[i]+a[j]+a[k])<value)
				{
					j++;
				}
				
				else
				{
					k--;
				}
			}
		}
	}

}
