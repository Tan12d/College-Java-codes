import java.util.Scanner;

public class Linear_Search 
{
	public int l_search(int y[],int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(y[i]==x)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Linear_Search l = new Linear_Search();
		
		int a[]= {3,45,63,23,44,56,23,29,32,32};
		
		System.out.println("The element you want to search:");
		int search = sc.nextInt();
		
		System.out.println(l.l_search(a, a.length, search));
	
        sc.close();
        
   	}

}
