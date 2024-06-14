public class Constructing_subsets 
{
	public static void generate_subsets(int a[],int k,int n,int b[])
	{
		backtrack(a,0,n,b);
	}
	
	static boolean finished=false;
	
	public static void backtrack(int a[],int k,int n,int b[])
	{
		int c[]=new int[n];
		
		if(is_a_solution(a,k,n,b))
		{
			process_solution(a,k,b);
		}
		
		else
		{
			k=k+1;
			
			int p=construct_candidate(a,k,n,c,b);
			
			for(int i=0;i<p;i++)
			{
				a[k]=c[i];
				backtrack(a,k,n,b);
				
				if(finished)
				{
					return;
				}
			}
		}
	}
	
	public static boolean is_a_solution(int a[],int k,int n,int b[])
	{
		return k==n;
	}
	
	public static int construct_candidate(int a[],int k,int n,int c[],int b[])
	{
		int nc;
		
		c[0]=0;//0=true
		c[1]=1;//1=false
		
		nc=2;	
		
		return nc;
	}
	
	public static void process_solution(int a[],int k,int b[])
	{
		System.out.print("(");		
		for(int i=1;i<=k;i++)
		{
			if(a[i]==0)
			{
				System.out.print(b[i]+",");
			}
		}
		System.out.print(")");
	
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int a[]= {0,3,6,8};
		int b[]= {0,3,6,8};
	
		generate_subsets(a,0,a.length-1,b);
	}

}
