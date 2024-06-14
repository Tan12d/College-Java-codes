import java.util.*;
public class PROJECT14
{

	public static void main(String[] args) 
	{
		Scanner q= new Scanner(System.in);
		
		int a;
		a= q.nextInt();
		
		int x= (int)(Math.random()*(3-0));
		
		System.out.println(x);
		System.out.println("scissor (0), rock (1), paper (2): " + x);
		
		System.out.print("The computer is ");
		
		switch ( x )
		{ 
		case 0:
			System.out.print("scissor.");
	    break;
		case 1:
			System.out.print("rock.");
	    break;
		case 2:
			System.out.print("paper.");
		break;
		}
		
		System.out.print(" You are ");
		
		switch ( a )
		{ 
		case 0:
			System.out.print("scissor");
	    break;
		case 1:
			System.out.print("rock");
	    break;
		case 2:
			System.out.print("paper");
		break;
		}
		
		if ( x == a )
			System.out.println(" too. It is a draw.");
		else
		{    
			System.out.print(". You ");
		
	        if ( (x == 0 && a == 1) || (x == 1 && a == 2) || (x == 2 && a == 0))
			   System.out.println("won");
		    else  
			   System.out.println("lost");
		}
		
	}

}
