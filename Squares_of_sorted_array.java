public class Squares_of_sorted_array
{
	public static void squares(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)Math.pow(a[i],2);
		}
		
		for(int j=1;j<a.length;j++)
		{
			int key=a[j];
			int i=j-1;
			
			while(i>=0 && a[i]>key)
			{
				a[i+1]=a[i];
				i--;
			}
			
			a[i+1]=key;
		}
		
		for(int y:a)
		{
			System.out.print(y+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int a[]= {-4,-1,0,3,10};
		
		squares(a);
	}

}
