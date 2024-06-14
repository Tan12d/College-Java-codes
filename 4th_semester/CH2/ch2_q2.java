
public class ch2_q2 {

	public static void main(String[] args) 
	{
		int a[]= {4,9,6,8,3,78,-3,45,-5,-3};
		
		int x=45;
		
		System.out.println(sequential_search(a,x));
	}
	
	public static int sequential_search(int a[],int x)
	{		
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				return i;
			}
		}
		
		return -1;
	}

}
