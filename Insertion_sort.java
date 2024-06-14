
public class Insertion_sort 
{
	public static void I_sort(int y[], int n)
	{
		for(int i=1;i<n;i++)
		{
			int key = y[i];
			int j =i-1;
			
			while(j>=0 && y[j]>key)
			{
				y[j+1] = y[j];
				j=j-1;
			}
			
			y[j+1] = key;
		}
		
		
		for(int k=0;k<y.length;k++)
		{
			System.out.print(y[k]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]= {42,21,89,22,77,1,9,21,49,12,94,3,97};
	
	    I_sort(a,a.length);
	}

}
