
public class quick_sort_2
{
	public static void main(String[] args)
	{
		int a[]= {8,3,9,2,7,5,2,1};
		
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
			sort(arr,low,p);
			sort(arr,p+1,high);
		}
	}

	public static int partition(int[] arr, int low, int high) 
	{
		int pivot=arr[low];//2,4,2,55,45,23,1,34,12
		
		int i=low-1;
		int j=high+1;
		
		while(true)
		{
			do
			{
				i++;
			}while(arr[i]<pivot);
			
			do
			{
				j--;
			}while(arr[j]>pivot);
			
			if(i>=j)
			{
				return j;
			}
			   
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}		
	}
}