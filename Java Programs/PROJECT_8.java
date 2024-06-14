/* Author's Name             : Tanmoy Das
 * Author's Regd.No          : 2041004073
 * Author's Branch & Section : CS-IT & 007
 * Subject                   : Introduction to Computer Programming
 */
public class PROJECT_8
{

	public static void main(String[] args) 
	{  //Q11. Suppose that a variable a is declared as int a = 2147483647
	   //     (or equivalently, IntegerMAX
	   //     a.System.out.println(a);
	   //     b.System.out.println(a+1);
	   //     c.System.out.println(2-a);
	   //     d.System.out.println(-2-a);
		
		int a = 2147483647;
		
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(2-a);
		System.out.println(-2-a);

	}

}
/* OUTPUT : 2147483647
            -2147483648
            -2147483645
            2147483647
*/