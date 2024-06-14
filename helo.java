import java.util.Arrays;

public class helo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,1,2,3,4,5,6,7};
		
		int j=0,k=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				j++;				
			}
			
			else
			{
				k++;
			}
		}
		
		int b[]=new int[j];
		
		int c[]=new int[k];
		
		
		for(int i=0,x=0,y=0;i<a.length && x<b.length && y<c.length;i++,j++,k++)
		{
			if(i%2==0)
			{
				b[x]=a[i];				
			}
			
			else
			{
				c[y]=a[i];
			}
		}
		
		Arrays.sort(b);
		Arrays.sort(c);
		
		int l=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=c[l--];
		}
		
		int y[]=new int[a.length];
		
		for(int i=0;i<b.length;i++)
		{
			y[i]=b[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			y[i]=c[i];
		}
		
		for(int e:y)
		{
			System.out.print(e+" ");
		}
		
	}

}
