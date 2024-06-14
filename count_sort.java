import java.util.Arrays;

public class count_sort 
{
 static void countSort(int[] arr)
		    {
		        int max = Arrays.stream(arr).max().getAsInt();
		        int min = Arrays.stream(arr).min().getAsInt();
		        
		        int range = max - min + 1;
		        
		        int count[] = new int[range];
		        int output[] = new int[arr.length];
		        
		        for (int i = 0; i < arr.length; i++) {
		            count[arr[i] - min]++;
		        }
		 
		        for (int i = 1; i < count.length; i++) {
		            count[i] += count[i - 1];
		        }
		 
		        for (int i = arr.length - 1; i >= 0; i--) {
		            output[count[arr[i] - min] - 1] = arr[i];
		            count[arr[i] - min]--;
		        }
		 
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = output[i];
		        }
		        
		        for(int k:count)
		        {
		        	System.out.print(k+" ");
		        }
		        
		        		        
		        
		    }
		 
		    
		 
		    // Driver code
		    public static void main(String[] args)
		    {
		        int[] arr = { 2,1,2,5,5,6,8,8,8};
		        countSort(arr);
		        
		        System.out.println();
		        for(int k:arr)
		        {
		        	System.out.print(k+" ");
		        }
		        
		    }
	

	}


