import java.util.Arrays;

public class Triplet_closest_to_zero
{
	public static void main(String[] args) 
	{
		int a[]= {4,2,-2,1,-3,-1,0};
		
		Arrays.sort(a);
		
		int value=0;
		
		for(int i=0;i<a.length-2;i++)
		{
			int j=i+1;
			int k=a.length-1;
			
			while(j<k)
			{
				if((a[j]+a[i]+a[k])==value)
				{
					System.out.println(a[j]+" "+a[i]+" "+a[k]);
					j++;
					k--;
				}
				
				else if((a[j]+a[i]+a[k])<value)
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
