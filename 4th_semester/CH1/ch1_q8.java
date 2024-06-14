
public class ch1_q8 
{
	public static void main(String[] args)
	{
		int a[]= {4,7,9,6,8,2,5};
		
		sort(a);
	}
	
	public static void sort(int a[])
	{
		int key,j;
		
		for(int i=1;i<a.length;i++)
		{
			key=a[i];
		    j=i-1;
		    
		    while(j>=0 && a[j]>key)
		    {
		    	a[j+1]=a[j];
		    	j--;
		    }
		    
		    a[j+1]=key;
		}
		
		for(int y:a)
		{
			System.out.print(y+" ");
		}
	}

}
