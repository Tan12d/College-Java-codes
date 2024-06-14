
public class Permutation_of_Integer_list 
{
	public static void sort(int a[],int l,int length)
	{
		if(l==length)
		{
			for(int i=0;i<length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		else
		{
			for(int i=l;i<length;i++)
			{
				int t=a[i];
				a[i]=a[l];
				a[l]=t;
				
				sort(a,l+1,length);
				
				int p=a[i];
				a[i]=a[l];
				a[l]=p;
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		int a[]= {0,1,2,3};
		
		sort(a,0,a.length);

	}

}
