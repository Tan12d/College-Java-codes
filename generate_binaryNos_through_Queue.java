import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class generate_binaryNos_through_Queue
{
	public static void generate(int n)
	{
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
		
		for(String s:res)
		{
			System.out.print(s+" ");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		generate(n);
		
		
//		Integer a[]=new Integer[10];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i].toBinaryString(i));
//		}		
	}

}
