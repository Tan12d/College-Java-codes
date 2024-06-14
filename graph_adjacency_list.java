import java.util.LinkedList;
import java.util.Stack;

public class graph_adjacency_list
{
	static int V;
	static int E;
	static LinkedList<Integer> []adj_list;
	
	@SuppressWarnings("unchecked")
	graph_adjacency_list(int nodes)
	{
		V=nodes;
		E=0;
		adj_list=new LinkedList[V];
		
		for(int v=0;v<V;v++)
		{
			adj_list[v]=new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u,int v)
	{
		adj_list[u].add(v);
		adj_list[v].add(u);
		E++;
	}
	
	public void print_adjlist() 
	{
		for(int v=0;v<V;v++)
		{
			System.out.print(v+": ");
			for(int w:adj_list[v])
			{
				System.out.print(w+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) 
	{
		graph_adjacency_list g=new graph_adjacency_list(5);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		g.addEdge(2,4);
		
		System.out.println("Number of Vertices= "+V);
		System.out.println("Number of Edges= "+E);
		
		g.print_adjlist();
		
	}

	
}
