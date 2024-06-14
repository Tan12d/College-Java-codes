import java.util.HashSet;

public class Pair_in_an_array 
{
	public static boolean find(int a[],int value)
	{
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(h.contains(value-a[i]))
			{
				System.out.println("The pair is "+a[i]+" and "+(value-a[i]));
				return true;
			}
			
			h.add(a[i]);
		}
		
		return false;
	}

	public static void main(String[] args) 
	{
		int a[]= {3,8,4,6,9,5,8,3};
		
		int value=12;
		
		System.out.println(find(a,value));

	}

}
