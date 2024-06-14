
public class binary_search_iterative 
{
	public static int b_search(int a[], int x)
	{
		int low = 0;
		int high = a.length-1;
		
		while(low <= high)
		{
			int mid = low+(high-low)/2;
			
			if(a[mid]==x)
			{
				return mid;
			}
			
			else if(x< a[mid])
			{
				high = mid-1;
			}
			
			else
			{
				low = mid+1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int s[]= {12,34,45,67,78,98,109};
		
		int search = 67;
		
		System.out.println(b_search(s, search));
	}

}

