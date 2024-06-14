import java.util.Scanner;

public class rotation
{
	public static void rotate(int []a,int k)
	{
		int []b=new int[a.length];
		int h=0;
		for(int i=k,j=0;i<a.length && j<a.length;i++,j++)
        {
			b[i]=a[j];
			h=j;
		}
		
		for(int i=0;i<k && h<a.length;i++,h++) 
		{
			b[i]=a[h+1];
		}
		
		for(int p:b)
		{
			System.out.print(p+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]= {1,2,8,7,6};
		
		for(int r:a)
		{
			System.out.print(r+" ");			
		}
		
		int s=sc.nextInt();
		
		rotate(a,s);
		
		sc.close();

	}

}
