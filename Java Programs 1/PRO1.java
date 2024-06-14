import java.util.*;
public class PRO1 
{

	public static void main(String[] args) 
	{
		
        Scanner x= new Scanner(System.in);
        
        double celsius;
        celsius= x.nextDouble();
        
        System.out.println("Enter a degree in Celsius: " + celsius);
        
        double fahrenheit= (9.0/5)*celsius + 32;
        
        System.out.println(+ celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	
        x.close();
        
	}
	

}
