import java.util.HashSet;
import java.util.Scanner;

public class ASS_3_Q7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<7;i++)
		{
			hs.add(sc.nextInt());
		}
		
		System.out.println(hs);
	}

}
