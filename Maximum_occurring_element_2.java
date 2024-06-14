
public class Maximum_occurring_element_2 
{
	public static int getMax(int[] arr, int size) 
	{
		 int max = arr[0], count = 1, maxCount = 1;
		 
		 for (int i = 0; i < size; i++) 
		 {
			 count = 1;
			 for (int j = i + 1; j < size; j++) 
			 {
				 if (arr[i] == arr[j]) 
				 {
					 count++;
				 }
			 }
			 
			 if (count > maxCount) 
			 {
				 max = arr[i];
				 maxCount = count;
			 }
		 }
		 return max;
	}
	
	public static void main(String[] args)
	{
		int a[]= {3,3,4,5,7,5,3,5,7,5,5,8};
		
		System.out.println(getMax(a,a.length));
		
	}

}
