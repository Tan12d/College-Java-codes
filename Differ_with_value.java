import java.util.Arrays;

public class Differ_with_value 
{
	public static boolean diff_value(int a[],int value)
	{
		int i=0,j=0,diff;
	    
	    while(i<a.length && j<a.length)
	    {
	    	diff=Math.abs(a[i]-a[j]);
	    	
	    	if(diff==value)
	    	{
	    		System.out.println(a[i]+" "+a[j]);
	    		return true;
	    	}
	    	
	    	else if(diff>value)
	    	{
	    		i++;
	    	}
	    	
	    	else
	    	{
	    		j++;
	    	}
	    }
	    return false;
	}
	
	public static void main(String[] args) 
	{
		int a[]= {2,5,7,3,6,3,6,7};
		
		int value=3;
		
		Arrays.sort(a);
		
	   System.out.println(diff_value(a,value));
	}

}
