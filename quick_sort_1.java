
public class quick_sort_1 
{
	public static void main(String[] args)
	{
		int a[]= {2,93,38,67};
		
		sort(a,0,a.length-1);
		
		for(int y:a)
		{
			System.out.print(y+" ");
		}
	}
	
	public static void sort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int p=partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
	}

	public static int partition(int[] arr, int low, int high) 
	{
		int pivot=arr[high];
		
		int i=low;
		int j=low;
		
		while(i<=high)
		{
		   if(arr[i]<=pivot)
		   {
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			   j++;
			   i++;
		   }   
		   
		   else
		   {
			   i++;
		   }
		}
	
		return j-1;
	}
}