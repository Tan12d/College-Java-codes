import java.util.Scanner;

public class Prime_or_Not 
{
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		
		else if(n==2)
		{
			return true;
		}
		
		else if(n%2==0)
		{
			return false;
		}
		
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println(isPrime(n));

	}

}
