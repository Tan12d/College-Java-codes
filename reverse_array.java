
public class reverse_array
{
	public static void main(String[] args)
	{
		int a[] = {2,11,5,10,7,8,1};
		
		int res[] = rev(a);
		
		for(int i:res)
			System.out.print(i+" ");
	}
	
	public static int[] rev(int res[])
	{
		int l=0,h=res.length-1;
		
		while(l<h)
		{
			int t= res[l];
			res[l]= res[h];
			res[h]= t;
			
			l++;
			h--;
		}
		
		return res;
	}

}
