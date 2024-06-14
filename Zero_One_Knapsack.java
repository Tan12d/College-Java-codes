
public class Zero_One_Knapsack
{
	public static void main(String[] args) 
	{
		int p[]= {0,10,8,12,9};
		int w[]= {0,3,2,5,8};
		
		int n=4,W=8;
		
		int k[][]=new int[n+1][W+1];
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0||j==0)
				{
					k[i][j]=0;
				}
				
				else if(w[i]<=j)
				{
					k[i][j]=Math.max(p[i]+k[i-1][j-w[i]], k[i-1][j]);
				}
				
				else
				{
					k[i][j]=k[i-1][j];
				}
			}
		}
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				System.out.printf("%4d",k[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n  Maximum value= "+k[n][W]);
		
		int w1[]=new int[w.length];
		
		int p1[]=new int[p.length];
		
		int i=n,j=W;
		
		while(i>0 && j>0)
		{
			if(k[i][j]==k[i-1][j])
			{
				i--;
			}
			
			else
			{
				k[i][j]=k[i][j]-p[i];
				
				j=j-w[i];
				
				w1[i]=w[i];
				p1[i]=p[i];	
				
				i--;
				
			}
		}
		System.out.println();
		
		for(int z:w1)
		{
			System.out.printf("%3d",z);
		}
		System.out.println();
		
		for(int z:p1)
		{
			System.out.printf("%3d",z);
		}
		
		System.out.print("\n\n  Items selected={");
		for(int a=1;a<w1.length;a++)
		{
			if(w1[a]!=0)
			{
				System.out.print(a+",");
			}
		}
		System.out.print("}");

	}

}
