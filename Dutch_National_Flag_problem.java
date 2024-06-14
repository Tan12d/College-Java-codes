
public class Dutch_National_Flag_problem 
{
	public static void main(String[] args) 
	{
		int a[]= {2,1,0,0,1,2,0,2,0,1,1,2,0};		
		
		int i=0,j=0,k=a.length-1;
		
		while(i<=k)
		{
			if(a[i]==0)
			{
				swap(a,i,j);
				i++;
				j++;
			}			
			else if(a[i]==1)
			{
				i++;
			}			
			else if(a[i]==2)
			{
				swap(a,i,k);				
				k--;
			}
		}
		
		for(int y:a)
		{
			System.out.print(y+" ");
		}

	}
	
	public static void swap(int a[], int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
