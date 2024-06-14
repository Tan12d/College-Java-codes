
public class Coding_Ninja_Product_Of_Array_Except_Self 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,0,3};
		
		int y[]= getProductArrayExceptSelf(arr);
		
		for(int i:y)
			System.out.print(i+" ");
	}
	
	public static int[] getProductArrayExceptSelf(int[] arr)
    {
    	int temp[] = new int[arr.length];

        int p=0;

        for(int i=0;i<arr.length;i++)
        {
            temp[p++]=mul(arr,arr[i]);
        }

        return temp;
    }

    public static int mul(int arr[],int n)
    {
        int res=1;

        for(int i:arr)
            res*=i;

        if(n!=0)
        	return res/n;
        
        else
        	return res;
    }
}
