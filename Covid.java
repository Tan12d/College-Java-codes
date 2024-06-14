import java.util.*;

public class Covid
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of rows:");
		int M=sc.nextInt();
		
		System.out.println("Enter the no. of seats in each row:");
		int N=sc.nextInt();
		
		if(N % 2 != 0)
			N = N+1;
		if(M % 2 != 0)
			M = M+1;
		System.out.println("NO of tickets = "+(M*N)/4);
		

	}

}
