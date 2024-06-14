import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ASS_2_Q6
{
	static int V;
	static int E;
	static LinkedList<Integer> []adj_list;
	
	@SuppressWarnings("unchecked")
	ASS_2_Q6(int nodes)
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
		ASS_2_Q6 g=new ASS_2_Q6(5);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		g.addEdge(2,4);
		
		System.out.println("Number of Vertices= "+V);
		System.out.println("Number of Edges= "+E);
		
		g.print_adjlist();
		
		bfs_traversal(0);
	}

	public static void bfs_traversal(int s)
	{
		boolean visited[]=new boolean[V];
		
		Queue<Integer> q=new ArrayDeque<Integer>();
		
		visited[s]=true;
		q.offer(s);
		
		while(!q.isEmpty())
		{
			int u=q.poll();
			System.out.print(u+" ");
			
			for(int v:adj_list[u])
			{
				if(!visited[v])
				{
					visited[v]=true;
					q.offer(v);
				}
			}
		}
		
		
		
	}
}
