//Search Insert Position in a Sorted Array
//Application of Binary Search
public class search_insert_position 
{
	public static int searchInsert(int p[], int target)
	{
		int low = 0;
		int high = p.length-1;
		
		while(low <= high)
		{
			int mid = low + (high-low)/2;
			//we can do (high+low)/2 but if high ranges to Integer's max bound so (low+high) will exceed he range, so there'll be overflow
			
			if(p[mid]==target)
			{
				return mid;
			}
			
			else if(target < p[mid])
			{
				high = mid-1;
			}
			
			else
			{
				low = mid+1;
			}
		}
		return low;
	}

	public static void main(String[] args)
	{
		
		int a[]= {1,10,20,4,59,65,75,88,99};
		
		int target = 66;
		
		System.out.println(searchInsert(a,target));	

	}

}
