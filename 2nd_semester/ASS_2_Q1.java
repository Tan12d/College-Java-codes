import java.util.ArrayList;
import java.util.*;

public class ASS_2_Q1 
{
	public static void main(String[] args)
	{		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(23);
		al.add(45);
		al.add(90);
		al.add(8);
		al.add(48);
		
		System.out.println(al);
		
		System.out.println("Enter the element you want to search:");
		int n=sc.nextInt();
		
		if(al.contains(n))
		{
			System.out.println("Element is present");
		}
		
		else
		{
			System.out.println("Element is not present");
		}
		
		System.out.println("Enter the position of the element you want to delete:");
		int p=sc.nextInt();
		
		al.remove(p);
		
		System.out.println(al);
		
		System.out.println("Checking....");
		
		if(al.isEmpty())
		{
			System.out.println("List is empty");
		}
		
		else
		{
			System.out.println("List is not empty");
		}
		
		
	}

}

