import java.util.Arrays;

public class sum_closest_to_zero_2
{
	public static void main(String[] args) 
	{
		int a[]= {4,-3,0,5-5,-7,-2};
		
		Arrays.sort(a);
		
		int l=0,h=a.length-1,x=0,y=0;
		
		int min=Math.abs(a[l]+a[h]),diff;
		
		while(l<h)
		{
			diff=Math.abs(a[l]+a[h]);
			
			while(min>diff)
			{
				min=diff;
				x=a[l];
				y=a[h];
			}
			
			if(diff>0)
			{
				l++;
			}
			
			else if(diff<0)
			{
				h--;
			}
			
			else
			{
				break;
			}
		}
		
		System.out.println(x+" "+y);
	}
}
