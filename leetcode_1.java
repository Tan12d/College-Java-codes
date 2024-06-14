
public class leetcode_1 {

	public static void main(String[] args) {
		
		int nums[]= {2,5,1,7};
		int target=9;
		
		int t[]=twoSum(nums,target);
		
		for(int p:t)
		{
			System.out.print(p+" ");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int t[]=new int[4];
		int p=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					t[p++]=i;
					t[p++]=j;
				}

			}
		}
			
		return t;        
    }

}
