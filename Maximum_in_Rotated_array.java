public class Maximum_in_Rotated_array
{
	public static int bs(int a[],int l,int h)
	{
		int mid=(l+h)/2;
		
		if(a[mid]>a[mid+1])
		{
			System.out.println("Position= "+mid);
			System.out.println((mid+1)%a.length);
			return a[mid];
		}
		
		else if(a[l]<=a[mid])
		{
			bs(a,mid+1,h);
		}
		
		else
		{
			bs(a,l,mid-1);
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int a[]= {3,4,5,1,2};
		
		System.out.println("Maximum= "+bs(a,0,a.length-1));		
	}

}
