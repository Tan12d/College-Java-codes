public class graph_adjacency_matrix_2
{
	static int V;
	static int E;
	static int [][]adjmatrix;
	
	graph_adjacency_matrix_2(int nodes)
	{
		V=nodes;
		E=0;
		adjmatrix= new int[V][V];
	}
	
	public void addEdge(int u,int v)
	{
		adjmatrix[u][v]=1;//Directed graph
		E++;
	}
	
	public static void print_adjmatrix()
	{
		for(int v=0;v<V;v++)
		{
			System.out.print(v+": ");
			for(int w=0;w<V;w++)
			{
				System.out.print(adjmatrix[v][w]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		graph_adjacency_matrix_2 g=new graph_adjacency_matrix_2(4);
		
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		
		System.out.println("Number of edges= "+E);
		System.out.println("Number of vertices= "+V);
		
		print_adjmatrix();

	}

}
