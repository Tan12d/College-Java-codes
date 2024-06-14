import java.util.HashSet;

public class Repeating_Elements {

	public static void main(String[] args) 
	{
		int a[]= { 34, 56, 77, 1, 34, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		HashSet<Integer> p=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(h.contains(a[i]))
			{
				System.out.print(a[i]+" ");
				p.add(a[i]);
			}
			
			else
			{
				h.add(a[i]);
			}
		}
		
		System.out.println("\nRepeating elements= "+p);
	}

}
