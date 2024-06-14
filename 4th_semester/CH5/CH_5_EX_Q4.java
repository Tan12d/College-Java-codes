
public class CH_5_EX_Q4 
{
	public static void main(String[] args)
	{
		int a[]= {0,1,1,0,0,1,0,1,1,0,0};
		
		int i=0,k=a.length-1;
		
		while(i<=k)
		{
			if(a[i]==0)
			{
				i++;
			}
			
			if(a[k]==1)
			{
				k--;
			}
			
			else
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				
				i++;
				k--;
			}
		}
		
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}
