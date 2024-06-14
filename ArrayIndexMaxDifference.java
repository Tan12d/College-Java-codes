
public class ArrayIndexMaxDifference 
{
	public static int diff(int a[])
	{
		int max_diff=-1;
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			j=a.length-1;
			
			while(j>i)
			{
				if(a[j]>a[i])
				{
					max_diff=Math.max(max_diff, j-i);
					break;
				}
				
				j--;
			}
		}
		
		return max_diff;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {33, 9, 10, 3, 2, 60, 30, 33, 1};
		
		System.out.println(diff(arr));
	}

}
