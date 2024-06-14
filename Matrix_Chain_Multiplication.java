
public class Matrix_Chain_Multiplication 
{
	public static void print_optimal_parens(int s[][],int i,int j)
	{
		if(i==j)
		{
			System.out.print(" A"+i+" ");
		}
		
		else
		{
			System.out.print("(");
			print_optimal_parens(s,i,s[i][j]);
			print_optimal_parens(s,s[i][j]+1,j);
			System.out.print(")");
		}
	}
	
	public static void main(String[] args) 
	{
		
		int p[]= {3,5,2,6,3};
		
		int n=p.length-1;
		
		int m[][]=new int[5][5];
    	int s[][]=new int[5][5];
    	
    	int j,q,min;
		
    	for(int i=1;i<=n;i++)
    	{
    		m[i][i]=0;
    	}
    	
    	for(int l=2;l<=n;l++)
    	{
    		for(int i=1;i<=n-l+1;i++)
    		{
    			j=i+l-1;
    			
    			min=Integer.MAX_VALUE;
    			
    			m[i][j]=0;
    			
    			for(int k=i;k<=j-1;k++)
    			{
    				q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
    				
    				if(q<min)
    				{
    					min=q;
    					s[i][j]=k;
    				}
    			}
    			
    			m[i][j]=min;
    		}
    	}
    	
    	for(int i=0;i<5;i++)
    	{
    		for(int k=0;k<5;k++)
    		{
    			System.out.printf("%4d",m[i][k]);
    		}
    		System.out.println();
    	}
    	
    	System.out.println();
    	
    	for(int i=0;i<5;i++)
    	{
    		for(int k=0;k<5;k++)
    		{
    			System.out.printf("%4d",s[i][k]);
    		}
    		System.out.println();
    	}

    	System.out.println();
    	print_optimal_parens(s,1,4);
    	
    	System.out.println("\nMinimum Scalar Multiplication= "+m[1][4]);
	}

}
