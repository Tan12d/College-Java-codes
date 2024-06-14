import java.util.HashMap;

public class Odd_Count_Elements
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,2,1,3,3,4,4,4,4,5,3};
		
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i],h.get(a[i])+1);
			}
			
			else
			{
				h.put(a[i],1);
			}
		}
		
		int count=0;
		
		for(int i=1;i<a.length;i+=2)
		{
			if(h.containsKey(a[i]) && (h.get(a[i])%2==1))
			{
				System.out.println(a[i]);
				count++;
				h.remove(a[i]);
			}
		}
		
		System.out.println(count);
		System.out.println(h);
        System.out.println();
		
	}

}
