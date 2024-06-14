import java.util.ArrayDeque;

public class ConvertXY
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> q=new ArrayDeque<Integer>();
		
		int s=4,d=9;
		
		q.add(s);
		
		for(int i=s;i<=d;i*=2)
		{
			q.add(i*2);
		}
		
		while(q.getLast()!=d)
		{
			q.add(q.getLast()-1);
		}
		
		System.out.println(q);
		
		System.out.println("Steps= "+(q.size()-1));
	}
}
