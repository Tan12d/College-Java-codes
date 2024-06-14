import java.util.*;
public class PROJECT17 
{

	public static void main(String[] args) 
	{
		Scanner j= new Scanner(System.in);
		
		int a;
		a= j.nextInt();
		
		System.out.println("Enter an integer: " + a);
		
		float p= a%5;
		float q= a%6;
		
		
		boolean w= (p == 0 && q ==0);
			System.out.println("Is " + a + " divisible by 5 and 6? " + w);
	    boolean y= ( p == 0 || q == 0 );
			System.out.println("Is " + a + " divisible by 5 or 6? " + y);
	    boolean z= ( (p == 0 || q == 0) && !( p == 0 && q == 0));
			System.out.println("Is " + a + " divisible by 5 or 6, but not both? " + z);
	
	}

}
