
public class Longest_Array_Subset_sum
{
	public static void main(String[] args) 
	{
		int w[]= {0,5,8,3,2};
		
		int M=13;
		
		int n=w.length-1,W=M;
		
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
					k[i][j]=Math.max(w[i]+k[i-1][j-w[i]], k[i-1][j]);
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
		
		int i=w.length-1,j=M;
		
		int c=0;
		
		while(i>0 && j>0)
		{
			if(k[i][j]==k[i-1][j])
			{
				k[i][j]=k[i][j]-w[i];
				
				j=j-w[i];
				
				w1[i]=w[i];
				
				i--;
			}
			
			else
			{
				i--;				
			}
		}
		System.out.println();
		
		for(int z:w1)
		{
			System.out.printf("%3d",z);
		}
		System.out.println();
		
		System.out.print("\n\n  Items selected={");
		for(int a=1;a<w1.length;a++)
		{
			if(w1[a]!=0)
			{
				System.out.print(a+",");
			}
		}
		System.out.print("}");
		
		
		System.out.println(c);
	}

}
