
public class ch1_q10 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		
		int a1[]=max_min_array(a);
		
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] max_min_array(int a[])
	{
		int a2[]=new int[a.length];
		
		int h=a.length-1,l=0;
		
		for(int i=0;i<a2.length;i+=2)
		{
			a2[i]=a[h--];
		}
		
		for(int i=1;i<a2.length;i+=2)
		{
			a2[i]=a[l++];			
		}		
		
		return a2;
	}

}
