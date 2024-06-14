
public class Rainwater
{
	public static void main(String[] args)
	{
		int a[]= {4,0,1,5};
		
		rain(a);
	}
	
	public static void rain(int a[])
	{
		int left[]=new int[a.length];
		int right[]=new int[a.length];
		
		int water=0;
		
		int max;
		
		max=a[0];
		left[0]=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
			left[i]=max;
		}
		
		max=a[a.length-1];
		right[a.length-1]=a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
			right[i]=max;
		}
		
		for(int i=0;i<a.length;i++)
		{
			water+= Math.min(left[i],right[i])-a[i];
		}
		
		System.out.println("water= "+water);
	}

}
