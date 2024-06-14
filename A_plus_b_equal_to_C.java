import java.util.Arrays;

public class A_plus_b_equal_to_C 
{
	public static void main(String[] args) 
	{
		int a[]= {2,6,1,3,5,7};
		
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]==a[j]+a[k]) 
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);						
					}
				}
			}
		}

	}

}
