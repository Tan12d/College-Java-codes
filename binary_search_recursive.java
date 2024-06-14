
public class binary_search_recursive 
{
	public static int bs(int a[],int low,int high,int x)
	{
		if(low==high)//when there is a single element
		{
			if(a[low]==x)
			{
				return low;				
			}
			
			else
			{
				return -1;
			}
		}
		
		else
		{
			int mid=low+(high-low)/2;
			
			if(a[mid]==x)
			{
				return mid;
			}
			
			else if(x<a[mid])
			{
				return bs(a,low,mid-1,x);
			}
			
			else
			{
				return bs(a,mid+1,high,x);
			}
		}
	}

	public static void main(String[] args)
	{
		int a[]= {12,87,12,54,6,34,78,56,47};
		
//		System.out.println("Enter the element you want to search:");
		int x=6;
		
		System.out.println(bs(a,0,a.length-1,x));		
	}

}
