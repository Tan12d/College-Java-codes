
public class ch1_q1 
{

	public static void main(String[] args)
	{
		
		int a[]= {3,8,-6,9,4,72,5};
		
		System.out.println(sum(a));
	}

	public static int sum(int a[])
	{
		int x=0;
		
		for(int i=0;i<a.length;i++)
		{
			x+=a[i];
		}
		
		return x;		
	}
}
