import java.util.Arrays;

public class Array_Reduction
{
	public static void main(String[] args)
	{
		int a[]= {5,1,1,1,2,3,5};
		
		Arrays.sort(a);
		
		int reduction=a[0];
		int c=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]-reduction>0)
			{
				System.out.println(a.length-i);
				reduction=a[i];
				c++;
			}
		}
		
		System.out.println("No. of reductions= "+c);
	}

}
