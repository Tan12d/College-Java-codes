import java.util.*;
public class PROJECT4 
{

	public static void main(String[] args) 
	{
		Scanner y= new Scanner(System.in);
		
		char character;
		character = y.next().charAt(0);
		
		System.out.println("Enter the character: " + character);
		
		if ( character >= 65 && character <= 90)
		    System.out.println("The character is a capital letter.");
		else if ( character >= 97 && character <= 122)
			System.out.println("The character is a small case letter.");
		else if ( character >= 48 && character <= 57)
		    System.out.println("The character is a digit.");
		else if ( (character >= 0 && character <= 47) || (character >= 58 && character <= 64) || (character >= 91 && character <= 96) || (character >= 123 && character <= 127))
            System.out.println("The character is a special symbol.");
		else
			System.out.println("False");
		
		y.close();
		
	}

}
