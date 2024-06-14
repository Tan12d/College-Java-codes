import java.util.*;
public class PROJECT5 
{

	public static void main(String[] args) 
	{
	      Scanner y= new Scanner(System.in);
	      
	      int marks;
	      marks= y.nextInt();
	      
	      System.out.println("Enter the marks secured by the Student " + marks);
	      
	      if ( marks >= 40 )
              System.out.println("He/She is pass in ICP");
	      else
	    	  System.out.println("He/She is not pass in ICP");
	      
	      y.close();
	}

}
