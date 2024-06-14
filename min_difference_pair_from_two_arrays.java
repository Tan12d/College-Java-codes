import java.util.Arrays;

public class min_difference_pair_from_two_arrays
{
	public static void main(String[] args) 
	{
		int a[]= {4,3,5,7,1};
		
		int b[]= {6,8,2,3,2};
		
		int i=0,j=0,l=0,h=0,diff;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int mindiff=Integer.MAX_VALUE;
		
		while(i<a.length && j<b.length)
		{
			diff=Math.abs(a[i]-b[j]);
			
			if(diff<mindiff)
			{
				mindiff=diff;
				l=a[i];
				h=b[j];				
			}
			
			if(a[i]<b[j])
			{
				i++;
			}
			
			else
			{
				j++;
			}
		}
		
		System.out.println(l+" "+h);
		System.out.println("mindiff= "+mindiff);

	}

}
