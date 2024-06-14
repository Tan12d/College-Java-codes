
public class Index_Array 
{
	public static void sort(int a[],int N)
	{
		int temp;
		
		for(int i=0;i<N;i++)
		{		
//			for(int j=0;j<N;j++)
//			{
//				if(i==a[j])
//				{
//					int t=a[j];
//					a[j]=a[i];
//					a[i]=t;
//				}
//		     }
			
			while(a[i]!=-1 && a[i]!=i)
			{
				temp=a[i];
				a[i]=a[temp];
				a[temp]=temp;			
			}			
       	}			
	}

	public static void main(String[] args)
	{
		int N=10;
		
		int a[]= {8,-1,6,1,9,3,2,7,4,-1};
		
		sort(a,N);
				
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}

}
