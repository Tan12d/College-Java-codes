import java.util.HashSet;

public class Sum_Distinct 
{
	public static void main(String[] args) 
	{
		int a[]= {5,7,5,7,9,1};
		
		int sum=0;
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
		}

		for(Integer i:h)
		{
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
