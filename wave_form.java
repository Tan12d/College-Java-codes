public class wave_form
{
	public static void sort(int a[])
	{
		for(int i=1;i<a.length;i+=2)
		{
			if((i-1)>0 && a[i]>a[i-1])
			{
				int t=a[i];
				a[i]=a[i-1];
				a[i-1]=t;
			}
			
			if((i+1)<a.length && a[i]>a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		
	}
	
	public static void main(String args[])
	{
		int a[]= {8,4,2,3,4,3,2,4,6,5,5,3,1};
		
		sort(a);
		
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}
}