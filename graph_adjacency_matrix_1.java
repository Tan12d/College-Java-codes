public class graph_adjacency_matrix_1 
{
	static int V;//Number of vertices
	static int E;//Number of edges
	static int [][]adjmat;
	
	graph_adjacency_matrix_1(int nodes)
	{
		V=nodes;
		E=0;
		adjmat= new int[V][V];
	}
	
	public void addEdge(int u,int v)
	{
		adjmat[u][v]=1;//Undirected graph
		adjmat[v][u]=1;//undirected graph
		E++;
	}
	
	public static void print_adjmatrix()
	{
		for(int v=0;v<V;v++)
		{
			System.out.print(v+": ");
			for(int w=0;w<V;w++)
			{
				System.out.print(adjmat[v][w]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		graph_adjacency_matrix_1 g=new graph_adjacency_matrix_1(4);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		
		System.out.println("Number of Vertices= "+V);
		System.out.println("Number of Edges= "+E);
		
		print_adjmatrix();
	}

}
