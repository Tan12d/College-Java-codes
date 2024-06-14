
public class GCD 
{
	public static int gcd(int a,int b)
	{
		int res=0;
		
		if(a==0 || b==0)
		{
			return 0;
		}
		
		else if(a==1 || b==1)
		{
			return 1;
		}
		
		else if(a>1 && b>1)
		{
			for(int i=2;i<=a && i<=b;i++)
			{
				if(a%i==0 && b%i==0)
				{
					res=i;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		int a=28;
		int b=56;
		
		System.out.println(gcd(a,b));
	}

}
