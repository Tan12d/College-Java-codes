import java.util.Scanner;

class Qnode
{
	int info;
	Qnode link;	
}

public class Queue_linkedlist 
{
	static Qnode front=null;
	static Qnode rear=null;
	
	public static void insert(int data)
	{
		Qnode n=new Qnode();
		n.info=data;
		
		if(rear==null)
		{
			front=rear=n;
			n.link=null;
		}
		
		else
		{
			rear.link=n;
			rear=n;
			n.link=null;
		}
	}
	
	public static void delete()
	{
		if(front==null)
		{
			System.out.println("queue is empty");
			return;
		}
		
		Qnode t=front;
		
		if(front==rear)
		{
			front=rear=null;
			
			System.out.println("f= "+front);
			System.out.println("r=" +rear);			
		}
		
		else
		{
			front=front.link;
			t.link=null;
			
			System.out.println("Deleted node= "+t.info);			
		}
	}
	
	public static void display()
	{
		if(front==null)
		{
			System.out.println("queue is empty");
			return;
		}
		
		else
		{
			System.out.println("queue is...");
			
			Qnode t=front;
			
			while(t!=null)
			{
				System.out.println(t.info+" --> ");
				t=t.link;
			}
					
		System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("Enter the item");
			int data1=sc.nextInt();
			insert(data1);
			System.out.println("new queue:");
			display();
			
			System.out.println("Do you want to add more item?(y/n)");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'|| ch=='Y');
		
		do
		{
			delete();
			display();
			
			System.out.println("Do you want to add more item?(y/n)");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'|| ch=='Y');

	}

}
