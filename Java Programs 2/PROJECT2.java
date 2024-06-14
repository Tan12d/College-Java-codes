import java.util.*;
public class PROJECT2 
{

	public static void main(String[] args) 
	{
		Scanner w= new Scanner(System.in);
		
		float mark;
		mark= w.nextFloat();
		
		System.out.println("Enter the mark of a student: ");
		
		if( mark >= 40 )
			System.out.println(" \"Congratulation! You have passed the exam.\" ");
		else 
			System.out.println(" \"Sorry! You have failed the exam.\" ");
		
		w.close();
		
	}

}
