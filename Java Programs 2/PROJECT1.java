import java.util.*;
public class PROJECT1
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int height;
		height= sc.nextInt();
		
		System.out.println("Enter the height of a person: " + height);
		
		if( height >= 6 )
			System.out.println("The person is tall ");
		else
			System.out.println("The person is not tall ");
		
		sc.close();
	}

}
