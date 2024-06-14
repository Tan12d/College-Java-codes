
public class Range_Partition
{
	public static void main(String[] args) 
	{
		int a[] = { 1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10,
				12, 11 };
		
		RangePartition(a,9,12);		
		
		for(int p:a)
		{
			System.out.print(p+" ");
		}
	}
	
	public static void RangePartition(int a[],int l,int h)
	{
		int i=0,j=0,k=a.length-1;
		
		while(i<=k)
		{
			if(a[i]<l)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				
				i++;
				j++;
			}
			
			else if(a[i]>h)
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				
				k--;
			}
			
			else 
			{
				i++;
			}
			
		}
		
	}
}
