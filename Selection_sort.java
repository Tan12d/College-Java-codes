
public class Selection_sort
{
	public static void s_sort(int y[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min = i;
						
			for(int j=i+1;j<n;j++)
			{
				if(y[j]<y[min])
				{
					min = j;					
				}				
			}
			
			int temp = y[min];
			y[min] = y[i];
			y[i] = temp;
		 }
		
		for(int k=0;k<n;k++)
		{
			System.out.print(y[k]+" ");
		}
	}

	public static void main(String[] args)
	{
		int a[]= {98,23,1,21,32,87,58};
		
		s_sort(a,a.length);
	}

}
