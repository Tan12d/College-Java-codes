import java.util.Arrays;

public class min_diff
{
	public static void main(String[] args) 
	{
		int a[]= {3,6,4,8,1,9,2};
		
		Arrays.sort(a);
		
		int diff=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]<diff)
			{
				diff=a[i+1]-a[i];
			}
		}
		System.out.println(diff);

	}

}
