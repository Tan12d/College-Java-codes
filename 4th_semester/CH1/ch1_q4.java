import java.util.Scanner;

public class ch1_q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("Enter the no. of rotations:");
		int k=sc.nextInt();
		
		int new_a[]=rotate(a,k);
		
		for(int i:new_a)
		{
			System.out.print(i+" ");
		}

	}
	
	public static int[] rotate(int a[],int k)
	{
		int a1[]=new int[a.length];
		
		int i=0,j=0,h=0;
		
		while(k<a.length)
		{
			a1[i++]=a[k];
			j=i;
			
			k++;
		}
		
		while(h<k && j<a1.length)
		{
			a1[j++]=a[h];
			
			h++;
		}
		
		return a1;		
	}

}
