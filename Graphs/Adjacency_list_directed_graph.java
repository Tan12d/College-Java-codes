import java.util.ArrayList;

public class Adjacency_list_directed_graph 
{
	public static void main(String[] args)
	{
		int n=5; //vertices
		int m=6; //edges
		
		ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<=n;i++)//n+1
		{
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(1).add(2); //adj.get(u).add(v);
		
		adj.get(1).add(3);
		
		adj.get(3).add(4);
		
		adj.get(2).add(4);
		
		adj.get(2).add(5);
		
		adj.get(4).add(5);
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"-> ");
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
			