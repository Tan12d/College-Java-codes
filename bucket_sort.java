
public class bucket_sort {

	public static void sort(int a[],int l,int h)
	{
		int i=0,j=0;
		
		int range=h-l;
		
		int count[]=new int[range];
		
		for(i=0;i<range;i++)
		{
			count[a[i]-l]++;
		}
		
		for(i=0;i<range;i++)
		{
			for(;0<count[i];count[i]--)
			{
				a[j++]=i+l;
			}
		}

	}
	
	public static void main(String[] args) 
	{
		int a[]= {2,2,5,6,5,8,8,8};
		
		sort(a,1,9);
	
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}

}
