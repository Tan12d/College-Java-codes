import java.util.Arrays;

public class Second_Maximum
{
	public static void main(String[] args) 
	{
		int a[] = {3,8,1,2,9,44,33};
		
		int res= sec_max(a);
		
		System.out.println(res);
	}
	
	public static int sec_max(int a[])
	{
		int l=Integer.MIN_VALUE;
		int s_l=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(l<a[i])
			{
				l=a[i];
			}
		}
		
		for(int j=0;j<a.length;j++)
		{
			if(s_l<a[j] && a[j]!=l)
				s_l=a[j];
		}
		
		int k = Arrays.stream(a).max().getAsInt();
		System.out.println(k);
		return s_l;
	}
}
