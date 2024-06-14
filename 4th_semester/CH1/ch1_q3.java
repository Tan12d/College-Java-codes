
public class ch1_q3 
{
	public static void main(String[] args) 
	{
		int a[]= {4,6,8,9,21,14,23,26,78,98,5445};
		
		int x=26;
		
		System.out.println(binary_search(a,x));
	}
	
	public static int binary_search(int a[],int x)
	{
		int mid,l=0,h=a.length-1;
		
		while(l<=h)
		{
			mid=(l+h)/2;
			
			if(a[mid]==x)
			{
				return mid;
			}
			
			else if(x<a[mid])
			{
				h=mid-1;
			}
			
			else
			{
				l=mid+1;
			}
		}
		
		return -1;
	}

}
