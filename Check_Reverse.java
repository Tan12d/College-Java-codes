                                                                                                
public class Check_Reverse 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,6,5,4,7,8,9};
	
		System.out.println(checkReverse(a));		
	}
	
	public static boolean checkReverse(int a[])
	{
		int start=-1;
		int stop=-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1])
			{
				start=i;
				break;
			}
		}
		
		if(start==-1)
		{
			return true;
		}
		
		for(int i=start;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				stop=i;
				break;
			}
		}
		
		if(stop==-1)
		{
			return true;
		}
		
		if(a[start-1]>a[stop] || a[stop+1]<a[start])
		{
			return false;
		}
		
		for(int i=stop+1;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				return false;
			}
		}
		
		return true;
	}

}
