
public class Zero_One_sort
{
	public static void sort(int a[])
	{
		int i=0,j=a.length-1;
		
		while(i<j)
		{
			if(a[i]==0)
			{
				i++;
			}
			
			if(a[j]==1)
			{
				j--;
			}
			
			else
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int a[]= {1,1,0,0,1,0,1,0,0,1,1,1,0,1};
		
		sort(a);
		
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}

}
