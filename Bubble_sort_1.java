public class Bubble_sort_1
{
	public static void b_sort(int q[], int n)
	{
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(q[j]>q[j+1])
				{
					int temp=q[j];
					q[j]=q[j+1];
					q[j+1]=temp;					
				}
			}
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.print(q[k]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int a[]= {34,-12,76,-32};		
		int len = a.length;				
		b_sort(a,len);

	}

}
