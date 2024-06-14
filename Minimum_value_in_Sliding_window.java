
public class Minimum_value_in_Sliding_window
{
	public static void main(String[] args) 
	{
		int a[]= {11, 2, 75, 92, 59, 90, 55};
		
		int b[]=new int[a.length-2];
		
		min(a,b,3);
	}

	public static void min(int a[],int b[],int k)
	{
		int m,p=0;
		
		for(int i=0;i<a.length-2;i++)
		{
			m=a[i];
			for(int j=i;j<i+3;j++)
			{
				if(a[j]<m)
				{
					m=a[j];
				}
			}
			System.out.print(m+" ");
			b[p++]=m;
		}
		
		int s=b[0];
		
		for(int i:b)
		{
			if(i>s)
			{
				s=i;
			}
		}
		
		System.out.println("\n"+"Maximum of Minimum value= "+s);
	}
}

