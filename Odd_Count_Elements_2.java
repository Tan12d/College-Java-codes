
public class Odd_Count_Elements_2
{
	public static void main(String[] args)
	{
		int a[]= {1,2,2,4,4,4};
		
		int xorsum=0;
		int first=0;
		int second=0;
		int setBit;
		
		for(int i=0;i<a.length;i++)
		{
			xorsum ^= a[i];
		}
		
		setBit= xorsum & ~(xorsum-1);
		
		for(int i=0;i<a.length;i++)
		{
			if((a[i] & setBit)!=0)
			{
				first^=a[i];
			}
			
			else
			{
				second^=a[i];
			}
		}
		
		System.out.println(first+" "+second);
	}

}
