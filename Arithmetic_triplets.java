import java.util.Arrays;

public class Arithmetic_triplets 
{
	public static void main(String[] args)
	{
		int a[]= {8,2,7,3,6,0,4,7,3,2,4};
		
		Arrays.sort(a);
		
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int k=i+1;
			
			while(j>=0 && k<a.length)
			{
				if(a[j]+a[k]==2*a[i])
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					j--;
					k++;
				}
				
				else if(a[j]+a[k]<2*a[i])
				{
					k++;
				}
				
				else
				{
					j--;
				}
			}
		}

	}

}
