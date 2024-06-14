
public class Adjacency_matrix_directed_graph 
{
	static int n1=5;
	
	static int adjacency_matrix[][]= new int[n1+1][n1+1];
	
	public static void fill(int u,int v)
	{
		adjacency_matrix[u][v]=1;
	}
	
	public static void main(String[] args) 
	{
		int n=5;
		
		int edges[][]= {{1,2},{1,3},{3,4},{2,4},{2,5},{4,5}};		
		
		for(int i=0;i<edges.length;i++)
		{
			for(int j=0;j<edges[0].length;j++)
			{
				fill(edges[i][j],edges[i][j+1]);
				j++;
			}
		}
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(adjacency_matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
