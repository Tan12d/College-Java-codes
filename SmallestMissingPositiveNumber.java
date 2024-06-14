import java.util.HashMap;

public class SmallestMissingPositiveNumber 
{
	public static void main(String[] args)
	{
		int[] arr = {8, 5, 6, 1, 9, 11, 2, 7, 4, 10};
		
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();

		for(int i=0;i<arr.length;i++)
		{
			h.put(arr[i],1);
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(!h.containsKey(i))
			{
				System.out.println(i);
			}
		}
	}

}
