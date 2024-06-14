import java.util.ArrayDeque;

public class circular_tour 
{
	public static void main(String[] args) 
	{
		int tour[][] = { { 8, 6 }, { 1, 4 }, { 7, 6 } };
		
		System.out.println(" Circular Tour : " + CircularTour(tour, 3));

	}
	
	public static int CircularTour(int tour[][], int n)
	{
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		 
		int nextPump = 0, prevPump;
		int count = 0;
		int petrol = 0;
		
		while (que.size() != n) 
		{
			 while (petrol >= 0 && que.size() != n)
			 {
				 que.add(nextPump);
				 petrol += (tour[nextPump][0] - tour[nextPump][1]);
				 nextPump = (nextPump + 1) % n;
			 }
			 
			 while (petrol < 0 && que.size() > 0) 
			 {
				 prevPump = que.remove();
				 petrol -= (tour[prevPump][0] - tour[prevPump][1]);
			 }
			 
			 count += 1;
			 
			 if (count == n)
				 return -1;
		}
		
		if (petrol >= 0)
			return que.remove();
			 
		else
			return -1;

	}

}
