import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bfs_and_dfs
{
	static int V;
	static int E;
	static LinkedList<Integer> adj_list[];
	
    @SuppressWarnings("unchecked")
	bfs_and_dfs(int nodes)
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
	
    public void print_graph()
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
		bfs_and_dfs g=new bfs_and_dfs(5);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		
		g.print_graph();
		
		System.out.println("Number of Vertices= "+V);
		System.out.println("Number of Edges= "+E);
		
		g.b_fs(0);
		System.out.println();
		g.dfs(0);		
	}
    
    public void b_fs(int s)
    {
    	boolean visited[]=new boolean[V];
    	
    	Stack<Integer> t=new Stack<Integer>();
    	
    	t.push(s);
    	
    	while(!t.isEmpty())
    	{
    		int u=t.pop();
    		
    		if(!visited[u])
    		{
        		visited[u]=true;
        		System.out.print(u+" --> ");
        		for(int v:adj_list[u])
        		{
        			if(!visited[v])
        			{
        				t.push(v);
        			}
        		}
    		}
    	}
    	
    }
    
    public void dfs(int s)
    {
    	boolean visited[]=new boolean[V];
    	
    	Queue<Integer> q=new ArrayDeque<Integer>();
    	
    	q.offer(s);
    	visited[s]=true;
    	
    	while(!q.isEmpty())
    	{
    		int u=q.poll();
    		
    		System.out.print(u+" --> ");
    		
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