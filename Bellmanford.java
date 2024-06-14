import java.util.LinkedList;

public class Bellmanford 
{
	static int V;
	static int E;
	static LinkedList<Integer> []adj_list;
	
	@SuppressWarnings("unchecked")
	Bellmanford(int nodes)
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
	
	public static void Relaxation(int u,int v,int w,int distance[],int pred[])
	{
		if(distance[v]>distance[u]+w)
		{
			distance[v]=distance[u]+w;
			pred[v]=u;
		}
	}
	
	public static void check(int u,int v,int w,int distance[],int pred[])
	{
		if(distance[v]>distance[u]+w && distance[u]!=Integer.MAX_VALUE)
		{
			System.out.println("Graph contains negative cycle");
			System.exit(0);
		}			
	}
	
	public static void main(String[] args)
	{
        int w[][]=new int[6][6];
		
		w[0][1]=2;
		w[0][2]=-1;
		w[1][4]=-5;
		w[2][1]=3;
		w[2][4]=4;
		w[3][5]=-4;
		w[4][3]=2;
		w[5][4]=3;
		
		Bellmanford g=new Bellmanford(6);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,4);
		g.addEdge(2,1);
		g.addEdge(2,4);
		g.addEdge(3,5);
		g.addEdge(4,3);
		g.addEdge(5,4);
		
		g.print_adjlist();
		
		System.out.println();
		
		int distance[]=new int[V];
		
		distance[0]=0;
		
		for(int j=1;j<V;j++)
		{
			distance[j]=Integer.MAX_VALUE;
		} 
		
		int pred[]=new int[V];
		
		for(int j=0;j<V;j++)
		{
			pred[j]=-1;
		}
		
		for(int a=1;a<V;a++)
		{
			for(int i=0;i<V;i++)
			{
				for(int x:adj_list[i])
				{
					Relaxation(i,x,w[i][x],distance,pred);
				}
			}
		}
		
		int sum=0;
		
		for(int i:distance)
		{
			System.out.print(i+" ");
			sum+=i;
		}
		
		System.out.println("\n\nShortest distance= "+sum);
			
		System.out.println();
		
		for(int i=0;i<V;i++)
		{
			System.out.print(pred[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<V;i++)
		{
			for(int x:adj_list[i])
			{
				check(i,x,w[i][x],distance,pred);				
			}
		}
		
		System.out.println("\nGraph contains no negative cycle");
	}
}
