
public class MaximumMinimumArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8};
		
		int i=0,j=a.length-1;
		
		int b[]=new int[a.length];
		
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				b[x]=a[j];
				j--;
			}
			
			else
			{
				b[x]=a[i];
				i++;
			}
		}

		for(int k:b)
		{
			System.out.print(k+" ");
		}
	}

}
