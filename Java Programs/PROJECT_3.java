/* Author's Name              : Tanmoy Das 
 * Author's Regd.No           : 2041004073
 * Author's Branch & Section  : CS-IT & 007
 * Subject                    : Intoduction to Computer Programming
 */
public class PROJECT_3
{

	public static void main(String[] args) 
	{ //Q7. Write a java program to exchange the value of two variables of integer type A and B using third temporary variable C.
		
		int A=80;
		int B=10;
	    int C;
	    
	    C=A;
	    A=B;
	    B=C;
	    System.out.println(" After swap A = " + A + " and B = " + B ++ );

	}

}
/* OUTPUT : After swap A = 10 and B = 80
*/