
public class Decimal_to_Binary
{
	public static void decToBinary(int n)
	{
		int a[]=new int[20];
		
		int i=0;
		
		while(n>0)
		{
			a[i]=n%2;
			n/=2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
	}
	
	public static void main(String[] args) 
	{
		int n=13;
		
		decToBinary(n);
	}
}
