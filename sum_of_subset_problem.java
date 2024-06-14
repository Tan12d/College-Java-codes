
public class sum_of_subset_problem 
{
	public static void main(String[] args)
	{
		int A[]= {0,5,8,3,2};
		int n=A.length-1;
		
		int W=13;
		
		int l=1;
		
		int m[][]=new int[n+1][W+1];
		
//		boolean b[][]=new boolean[n+1][W+1];
		
		int b[][]=new int[n+1][W+1];
		
		String new_b[][]=new String[n+1][W+1];
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				m[i][j]=0;
				b[i][j]=1;
			}
		}
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int w=1;w<=W;w++)
			{
				if(A[i]<=w)
				{
					m[i][w]=Math.max(m[i-1][w],A[i]+m[i-1][w-A[i]]);
					
					if(m[i-1][w]>A[i]+m[i-1][w-A[i]])
					{
						b[i][w]=0;
					}
					
					else
					{
						b[i][w]=1;
					}
				}
				
				else
				{
					m[i][w]=m[i-1][w];
					
//					b[i][w]=false;
					
					b[i][w]=0;
				}
			}
		}
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				System.out.printf("%4d",m[i][j]);
			}			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				System.out.print(b[i][j]+"  ");
			}			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(b[i][j]==1)
				{
					new_b[i][j]="true ";
				}
				
				else if(b[i][j]==0)
				{
					new_b[i][j]="false";
				}
				
				
			}			
		}
				
		System.out.println();
		

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{ 
				System.out.printf("  "+new_b[i][j]);
			}			
			System.out.println();
		}
				
		System.out.println();
		
		select(m,A,n,W);

	}
	
	public static void select(int m[][],int A[],int n,int W)
	{
		int sw[]=new int[A.length];
		
		int i=n,j=W;
		
		while(i>0 && j>0)
		{
			if(m[i][j]==m[i-1][j])
			{
				sw[i]=0;
				i--;
			}
			
			else
			{
				int t=m[i][j];
				m[i][j]=t-A[i];
				
				sw[i]=A[i];	
				
				i--;
				j=t-A[i];							
			}
		}
		
		int max=0;
		
		for(int k=0;k<sw.length;k++)
		{
			System.out.print(sw[k]+" ");
			max+=sw[k];
		}
		
		System.out.println();
		
		System.out.print("\nThe Subset is: {");
		for(int k=0;k<sw.length;k++)
		{
			if(sw[k]!=0)
			{
				System.out.print(k+",");
			}
		}
		
		System.out.print("}");
		
		System.out.println();
		
		System.out.println("\nThe maximum subset sum= "+max);
	}

}
