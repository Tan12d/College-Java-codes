
public class merge_two_sorted_arrays
{

	public static void merge_sorted(int p[], int q[], int n, int m)
	{
		int s[] = new int[n+m];
		
		int i=0,j=0,k=0;
		
		while(i<n && j<m)
		{
			if(p[i]<q[j])
			{
				s[k] = p[i];
				i++;
			}
			
			else
			{
				s[k] = q[j];
				j++;
			}
			
			k++;
		}
		
		while(i<n)
		{
			s[k] = p[i];
			i++;
			k++;					
		}
		
		while(j<m)
		{
			s[k] = q[j];
			j++;
			k++;
		}
		
		for(int o=0;o<s.length;o++)
		{
			System.out.print(s[o]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[] = {1,4,7,9};
		
		int b[] = {2,6,10,12};
				
		merge_sorted(a, b, a.length, b.length);
	}

}
