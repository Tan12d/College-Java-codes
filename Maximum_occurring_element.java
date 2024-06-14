
import java.util.HashSet;

public class Maximum_occurring_element
{
	public static void main(String[] args)
	{
		int a[]= {2,4,1,6,4,6,1,2,6,6,1,6};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
		}
		
		Object[] k=h.toArray();
		
		int y[]=new int[k.length];
		
		for(int p=0;p<k.length;p++)
		{
			y[p]=(int)(k[p]);
		}
		
		int count=1,maxcount=1,max=a[0];
		
		for(int j=0;j<k.length;j++)
		{
			count=0;
			for(int i=0;i<a.length;i++)
			{
				if(y[j]==a[i])
				{
					count++;
				}				
			}
		    
			if(count>maxcount)
			{
				max=a[j];
				maxcount=count;
			}
		}
		
		System.out.println(max);
		
		System.out.println(maxcount);
	}

}
