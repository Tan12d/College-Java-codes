import java.util.HashSet;

public class Missing_Values
{
	public static void main(String[] args)
	{
		int a[]= {86,30,34,56,89,43,98,32,67};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
			
			if(min>a[i])
			{
				min=a[i];
			}
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		for(int i=min;i<=max;i++)
		{
			if(!h.contains(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
