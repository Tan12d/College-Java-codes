import java.util.Arrays;

public class sum_closest_to_zero 
{
	public static void main(String[] args)
	{
		int a[]= {-1,5,3,2,-4,3,-5,-3};
		
		Arrays.sort(a);
		
		int l=0,h=a.length-1;
		
		int sum=0;
		
		while(l<h)
		{
			if((a[l]+a[h])==sum)
			{
				System.out.println(a[l]+" "+a[h]);
				l++;
				h--;
			}
			
			else if((a[l]+a[h])<sum)
			{
				l++;
			}
			
			else if((a[l]+a[h])>sum)
			{
				h--;
			}
		}
	}

}
