
public class permutation_backtracking
{
	public static void generate_permutation(int a[],int n)
	{
		backtrack(a,0,n);
	}
	
	public static void backtrack(int a[],int k,int n)
	{
		int c[]=new int[n];
		
		if(is_a_solution(a,k,n))
		{
			process_solution(a,k);
		}
		
		else
		{
			k=k+1;
			
			int p=construct_candidate(a,k,n,c);
			
			for(int i=0;i<p;i++)
			{
				a[k]=c[i];
				backtrack(a,k,n);
			}
		}
	}
	
	public static boolean is_a_solution(int a[],int k,int n)
	{
		return k==n;
	}
	
	public static void process_solution(int a[],int k)
	{
		for(int i=1;i<=k;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static int construct_candidate(int a[],int k,int n,int c[])
	{
		int nc;
		
		boolean inperm[]=new boolean[n+1];
		
		for(int i=1;i<=n;i++)
		{
			inperm[i]=false;
		}
		
		for(int i=1;i<k;i++)
		{
			inperm[a[i]]=true;
		}
		
		nc=0;
		
		for(int i=1;i<=n;i++)
		{
			if(inperm[i]==false)
			{
				c[nc]=i;
				nc++;
			}
		}
		
		return nc;
	}
	
	public static void main(String[] args) 
	{
		int a[]= {0,1,2,3};
		
		generate_permutation(a,a.length-1);
	}

}
