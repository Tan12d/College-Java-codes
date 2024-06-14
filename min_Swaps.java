
public class min_Swaps 
{
	public static void main(String[] args) 
	{
		int a[]= {5,6,9,7,6,78,5,3,3,4,3};
		
		int swapCount=0;
		int i=0,j=a.length-1;
		
		int t,value=6;
		
		while(i<j)
		{
			if(a[i]<=value)
			{
				i++;
			}
			
			else if(a[j]>value)
			{
				j--;
			}
			
			else
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
				swapCount++;
			}
		}
		
		System.out.println(swapCount);
	}

}
