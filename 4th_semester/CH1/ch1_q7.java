
public class ch1_q7 
{
	public static void main(String[] args) 
	{
		int a[]= {8,5,-1,4,1,-1,3,9,7,-1};
		
		int a1[]=index(a);
		
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] index(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			while(a[i]!=-1 && a[i]!=i)
			{
				int t=a[i];
				a[i]=a[t];
				a[t]=t;
			}
		}
		
		return a;
	}

}
