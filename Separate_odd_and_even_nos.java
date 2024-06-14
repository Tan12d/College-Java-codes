import java.util.Vector;

public class Separate_odd_and_even_nos
{
	public static void main(String[] args)
	{
		int a[]= {2,1,2,5,7,1,9,3,6,8,8};
		
		Vector<Integer> h=new Vector<Integer>();
		
		Vector<Integer> h1=new Vector<Integer>();
				
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				h.add(a[i]);
			}
			
			else
			{
				h1.add(a[i]);
			}
		}
		
		System.out.println("Even= "+h);
		
		System.out.println("Odd= "+h1);		
	}

}
