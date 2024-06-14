
public class CH_5_EX_Q5 
{
	public static void main(String[] args) 
	{
		int a[]= {1,0,2,0,1,1,0,2,0,0,1,2};
		
		int i=0,j=0,k=a.length-1;
		
		while(i<=k)
		{
			if(a[i]==0)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				
				i++;
				j++;
			}
			
			else if(a[i]==1)
			{
				i++;
			}
			
			else
			{
				int y=a[i];
				a[i]=a[k];
				a[k]=y;
				
				k--;				
			}
		}
		
		for(int p:a)
		{
			System.out.print(p+" ");
		}
	}

}
