/* Author's Name             : Tanmoy Das 
 * Author's Regd.No          : 20414004073
 * Author's Branch & Section : CS-IT & 007
 * Subject                   : Introduction to Computer Programming 
 */
public class PROJECT_4 
{

	public static void main(String[] args) 
	{  //Q8. Write a java program to exchange the values of two variables of integer type A and B without using third temporary variable.
		
		int A=33;
		int B=72;
		
		System.out.println("Before Swaping A = " + A + " and B = " + B);
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("After Swaping A =" + A + " and B = " + B ++);

	}

}
/* OUTPUT : Before Swaping A = 33 and B = 72
            After Swaping A = 72 and B = 33
*/