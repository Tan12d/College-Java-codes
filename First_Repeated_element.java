import java.util.HashSet;

public class First_Repeated_element 
{
	public static int first_repeated(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]==a[j])
				{
					return a[i];
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) 
	{
		int a[]= { 34, 56, 77, 1, 34, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30};
		
		System.out.println(first_repeated(a));

	}

}
