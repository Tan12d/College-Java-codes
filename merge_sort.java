
public class merge_sort
{
	public static void sort(int u[], int v[], int low, int high)
	{
		if(low<high)
		{
			int mid = low + (high-low)/2;
			
			sort(u,v,low,mid);
			sort(u,v,mid+1,high);
			merge(u,v,low,mid,high);
		}		
	}

	public static void merge(int u[],int v[],int low, int mid,int high)
	{
		for(int i=low;i<=high;i++)
		{
			v[i]=u[i];
		}
		
		int i=low,j=mid+1,k=low;
		
		while(i<=mid && j<=high)
		{
			if(v[i] <= v[j])
			{
				u[k++]=v[i++];
			}
			
			else
			{
				u[k++]=v[j++];
			}
		}
		
		while(i<=mid)
		{
			u[k++]=v[i++];
		}
		
		while(j<=high)
		{
			u[k++]=v[j++];
		}
	}
	
	public static void main(String[] args)
	{
		int a[]= {29,12,32,98,21,48};
		
		sort(a,new int[a.length],0,a.length-1);
		
		for(int y:a) 
		{
			System.out.print(y+" ");
		}
	}
}
