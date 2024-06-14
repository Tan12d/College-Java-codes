import java.util.Scanner;

public class calculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		while(true)
		{
			if(n>=1 && n<=5)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				if(n==1)
				{
					System.out.println(a+b);
				}
				
				else if(n==2)
				{
					System.out.println(a-b);
				}
				
				else if(n==3)
				{
					System.out.println(a*b);
				}
				
				else if(n==4)
				{
					System.out.println(a/b);
				}
				
				else if(n==5)
				{
					System.out.println(a%b);
				}
			}
			
			else if(n==6)
			{
				System.exit(0);
			}
			
			else
			{
				System.out.println("Invalid Operation");
			}
			
			n=sc.nextInt();
		}

	}

}
