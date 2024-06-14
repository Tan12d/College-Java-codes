
public class MaximumPathSum
{
	public static void path(int a[],int b[])
	{
		int c[];
		
		int sum=0,i=0,j=0,k=0;
		if(a.length>b.length)
		{
			c=new int[a.length];
		}
		
		else
		{
			c=new int[b.length];
		}
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<=b[j])
			{
				c[k]=a[i];
				i++;
			}
			
			else
			{
				c[k]=b[j];
				j++;
			}
			
			k++;
		}
		
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		
		for(int p:c)
		{
			sum+=p;
		}
		
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int a[]= {12, 13, 18, 20, 22, 26, 70};
		
		int b[]= {11, 15, 18, 19, 20, 26, 30, 31};
		
		path(a,b);
	}

}
