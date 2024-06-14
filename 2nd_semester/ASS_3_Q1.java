import java.util.Scanner;
import java.util.TreeSet;

public class ASS_3_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(2);
		t.add(9);
		t.add(3);
		t.add(6);
		t.add(7);
		
		System.out.println(t);
		
		System.out.print("Enter the number you want to search:");
		int s=sc.nextInt();
		
		System.out.println(t.contains(s));
		
		t.remove(9);
		
		System.out.println(t);
	}

}
