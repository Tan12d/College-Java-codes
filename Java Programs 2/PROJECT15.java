import java.util.*;
public class PROJECT15 
{
     public static void main(String[] args)
     {
    	 Scanner e= new Scanner(System.in);
    	 
    	 double x1;
    	 double y1;
    	 
    	 double x2= 0;
    	 double y2= 0;
    	 
    	 x1= e.nextDouble();
    	 y1= e.nextDouble();
    	 
    	 System.out.println("Enter a point with two coordinates: " + x1 + " " + y1);
    	 
    	 double res1= x2-x1;
    	 double res2= y2-y1;
    	 
    	 double res3= Math.pow(res1,2);
    	 double res4= Math.pow(res2,2);
    	 
    	 double res5= res3 + res4;
    	
    	 double res6= Math.pow(res5,0.5);
    	 
    	 if ( res6 <= 10 ) 
    		 System.out.println("Point (" + x1 + "," + y1 + ") is in the circle");
    	 else 
    		 System.out.println("Point (" + x1 + "," + y1 + ") is not in the circle");
    	 double x3;
    	 double y3;
    	 
    	 x3= e.nextDouble();
    	 y3= e.nextDouble();
    	 
    	 System.out.println("Enter a point with two coordinates: " + x3 + " " + y3);
    	 
    	 double x4= 0;
    	 double y4= 0;
    	 
    	 double res7= x4-x3;
    	 double res8= y4-y3;
    	 
    	 double res9= Math.pow(res7,2);
    	 double res10= Math.pow(res8,2);
    	 
    	 double res11= res9 + res10;
    	
    	 double res12= Math.pow(res11,0.5);
    	 
    	 if ( res12 <= 10 )
    		 System.out.println("Point (" + x3 + "," + y3 + ") is in the circle");
    	 else
    		 System.out.println("Point (" + x3 + "," + y3 + ") is not in the circle");
     }
}
