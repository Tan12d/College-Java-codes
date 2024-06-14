import java.util.Arrays;
import java.util.HashSet;

public class difference_with_value 
{
	public static void main(String[] args)
	{
		int a[]= {-1,5,3,2,-4,3,-5,-3};
	
		Arrays.sort(a);
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		int diff=2;
		
		for(int i:a)
		{
			h.add(i);
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(h.contains((diff+a[i]))||h.contains(Math.abs(diff+a[i])))
			{
				System.out.println(a[i]+" "+(diff+a[i]));
			}
		}
		
	}
}
