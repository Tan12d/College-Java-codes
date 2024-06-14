import java.util.Arrays;

public class missing_number 
{
	public static void main(String[] args)
	{
		int a[]= {10,1,3,2,6,9,4,5,8};
		
		int sum=0;
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			sum +=a[i];			
		}
		
		System.out.println("largest = "+a[a.length-1]);
		
		System.out.println("Missing number= "+(((a[a.length-1]*(a[a.length-1]+1))/2)-sum));
		

	}

}
