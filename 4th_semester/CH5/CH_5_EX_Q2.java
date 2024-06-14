import java.util.Arrays;

public class CH_5_EX_Q2 
{
	public static void main(String[] args) 
	{
		int a[]= {-1,4,2,6,1,7,8,0};
		
		int value=8;
		
		Arrays.sort(a);

		for(int i=1;i<a.length;i++)
		{
			int j=i-1,k=i+1;
			
			while(j>=0 && k<a.length)
			{
				if((a[j]+a[i]+a[k])==value)
				{
					System.out.println(a[j]+" "+a[i]+" "+a[k]);
					k++;
					j--;					
				}
				
				else if((a[j]+a[i]+a[k])>value)
				{
					j--;
				}
				
				else
				{
					k++;
				}
			}
		}
	}

}
