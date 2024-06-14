
public class Moving_Zeroes 
{
	public static void main(String[] args) 
	{
		int a[] = {1,0,1,1,0,1,1,0,1,0,0,0,1,1,1,1};
		
		int res[] = zeroes(a);
		
		for(int i:res)
			System.out.print(i+" ");
	}
	
	public static int[] zeroes(int a[]) 
	{
		int l=0,h=a.length-1;
		
		while(l<h)
		{
			if(a[l]==0 && a[h]==1)
			{
				int t=a[l];
				a[l]=a[h];
				a[h]=t;
				
				l++;
				h--;
			}
			
			else if(a[l]==1)
				l++;
			
			else if(a[h]==0)
				h--;				
		}
		
		return a;
	}
}
