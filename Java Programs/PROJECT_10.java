/* Author's Name             : Tanmoy Das
 * Author's Regd.No          : 2041004073
 * Author's Branch & Section : CS-IT & 007
 * Subject                   : Introduction to Computer Programming
 */
public class PROJECT_10 
{

	public static void main(String[] args) 
	{  //Q13 Assume a string variable ruler1 contains "1" initially i.e.
	   //    String ruler1 = "1"
	   //    Write a java program to print the following output using string concatenation. (You can take extra string variables.)
		
		String ruler1 = " 1 ";
		String ruler2 = " 1 " + " 2 " + " 1 ";
		String ruler3 = " 1 " + " 2 " + " 1 " + " 3 " + " 1 " + " 2 " + " 1 ";
		String ruler4 = " 1 " + " 2 " + " 1 " + " 3 " + " 1 " + " 2 " + " 1 " + " 4 " + " 1 " + " 2 " + " 1 " + " 3 " + " 1 " + " 2 " + " 1 ";
		
		System.out.println(ruler1);
		System.out.println(ruler2);
		System.out.println(ruler3);
		System.out.println(ruler4);

	}

}
/* OUTPUT : 1
            1 2 1
            1 2 1 3 1 2 1
            1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
*/