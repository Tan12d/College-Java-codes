
public class ch1_q6 
{
	public static void main(String[] args) 
	{
		int a[]= {3,5,4,6,5,7,13,78,5,46,9};
		
		int a1[]=wave(a);
		
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] wave(int a[])
	{
		for(int i=1;i<a.length;i+=2)
		{
			if(a[i-1]<a[i])
			{
				int t=a[i];
				a[i]=a[i-1];
				a[i-1]=t;
			}
			
			else if(a[i+1]<a[i])
			{
				int p=a[i];
				a[i]=a[i+1];
				a[i+1]=p;
			}
		}
		
		return a;
	}

}
