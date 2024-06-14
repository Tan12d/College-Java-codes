import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Weighted_adjacency_list_undirected_graph 
{
	public static void main(String[] args)
	{
		int n=5; //vertices
		int m=6; //edges
		
		ArrayList<Map<Integer,Integer>> adj =new ArrayList<Map<Integer,Integer>>();
		
		for(int i=0;i<=n;i++)//n+1
		{
			adj.add(new TreeMap<Integer,Integer>());
		}
		
		adj.get(1).put(2,2); //adj.get(u).add(v);
		adj.get(2).put(1,2); //adj.get(v).add(u);
		
		adj.get(1).put(3,3);
		adj.get(3).put(1,3);
		
		adj.get(3).put(4,4);
		adj.get(4).put(3,4);
		
		adj.get(2).put(4,1);
		adj.get(4).put(2,1);
		
		adj.get(2).put(5,6);
		adj.get(5).put(2,6);
		
		adj.get(4).put(5,3);
		adj.get(5).put(4,3);
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"-> ");
			for(Map.Entry<Integer,Integer> entry: adj.get(i).entrySet())
			{
				System.out.print("("+entry.getKey()+","+entry.getValue()+")");
			}
			System.out.println();
		}
	}
}
			