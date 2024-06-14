import java.util.*;
public class PROJECT16 
{

	public static void main(String[] args) 
	{
		Scanner g= new Scanner(System.in);
		
		int marks;
		marks= g.nextInt();
		
		System.out.println("Enter marks = " + marks);
	    
		int a= marks % 10;
		
		switch ( a )
		{  
	    case 10:
		case 9:
			   System.out.println("grade = O");
	    break;
	    case 8:
	    	   System.out.println("grade = A"); 
		break;
	    case 7:
	    	   System.out.println("grade = B");
	    break;
	    case 6:
	    	   System.out.println("grade = C");
	    break;
	    case 5:
	    	   System.out.println("grade = D");
	    break;
	    case 4:
	    	   System.out.println("grade = E");
	    break;
	    default:
	    	   System.out.println("grade = F");
	    break;
	    }
		
	}

}
