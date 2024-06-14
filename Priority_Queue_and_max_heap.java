import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_and_max_heap
{
	public static void main(String[] args) 
	{
		int a[]= {6,4,3,6,9,2,1,5};
		
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		
		for(int i:a)
		{
			q.add(i);
		}
		
		System.out.println(q);
		
		while(q.isEmpty()==false)
		{
			System.out.print(q.remove()+" ");
		}
		
		System.out.println();
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i:a)
		{
			p.add(i);
		}
		
		System.out.println(p);
		
		while(p.isEmpty()==false)
		{
			System.out.print(p.remove()+" ");
		}
	}
	
}