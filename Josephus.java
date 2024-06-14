import java.util.LinkedList;
import java.util.Queue;

public class Josephus 
{
    public static void main(String[] args)
    {
        int position = 2;
        int count = 6;

        printJosephusPositions(count, position);
        
        System.out.println("\n"+josephus(count,position));
    }

    public static void printJosephusPositions(int count, int position) 
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for (int i = 0; i < count; i++) 
        {
            queue.add(i);
        }

        while(!queue.isEmpty()) 
        {
            for (int i = 1; i <= position; i++) 
            {
                int eliminatedPosition = queue.poll();

                if (i == position) 
                {
                    System.out.print(eliminatedPosition + " ");
                    break;
                }

                queue.add(eliminatedPosition);
            }
        }
    }
    
    public static int josephus(int count,int position)
    {
    	if(count==1)
    	{
    		return 1;
    	}
    	
    	else
    	{
    		 return (josephus(count - 1, position) + position - 1) % count + 1;
    	}
    }
}