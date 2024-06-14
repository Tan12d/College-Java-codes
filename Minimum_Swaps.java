
public class Minimum_Swaps
{
	public static void main(String[] args) 
	{
		int a[]= {3,6,4,7,9,34,72,13,4};
		
		sort(a,7);
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void sort(int a[],int x)
	{
		int i=0,j=a.length-1,k=0,c=0;
		
		while(i<=j)
		{
			if(a[i]<x)
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				
				c++;
				i++;
				k++;
			}
			
			else if(a[i]>x)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				
				j--;
			}
			
			else
			{
				i++;
			}
		}
		
		System.out.println("Minimum Swaps= "+c);
	}

}
