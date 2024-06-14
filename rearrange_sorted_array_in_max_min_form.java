
public class rearrange_sorted_array_in_max_min_form
{
	public static void main(String[] args)
	{
		int a[]= {2,3,5,6,8,9};
		
		int temp[]=new int[a.length];
		
		int i=0,j=a.length-1,k=0;
		
		while(i<=j)
		{
			if(k%2==0)
		    {
			   temp[k]=a[j];
			   j--;
			}
				
			else
			{
				temp[k]=a[i];
				i++;
			}
				
			k++;			
		}
		
		
		for(int y:temp)
		{
			System.out.print(y+" ");
		}

	}

}
