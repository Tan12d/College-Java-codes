import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binary_number_with_queue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String res[]=new String[n];
		
		Queue<String> q=new LinkedList<String>();
		
		q.offer("1");
		
		for(int i=0;i<n;i++)
		{
			res[i]=q.poll();
			String n1=res[i]+"0";
			String n2=res[i]+"1";
			q.offer(n1);
			q.offer(n2);
		}
		
		System.out.println("Binary form of "+n+ " is= "+ res[res.length-1]);
	}

}
