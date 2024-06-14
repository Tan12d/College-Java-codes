
public class n_GCD 
{
	public static int gcd(int a,int b,int c,int d)
		{
			int res=0;
			
			if(a==0 || b==0 || c==0 || d==0)
			{
				return 0;
			}
			
			else if(a==1 || b==1 || c==1 || d==1)
			{
				return 1;
			}
			
			else if(a>1 && b>1 && c>1 && d>1)
			{
				for(int i=2;i<=a && i<=b;i++)
				{
					if(a%i==0 && b%i==0 && c%i==0 && d%i==0)
					{
						res=i;
					}
				}
			}
			return res;
		}
		
		public static void main(String[] args) 
		{
			int a[]= {12,36,60,96};
			
			System.out.println(gcd(12,36,60,96));
		}
}
