import java.util.Scanner;

public class Queue_array 
{
	static int Max=5;
	static int front=-1;
	static int rear=-1;
	static int a[]=new int[Max];
	
	public static void insert(int new_item)
	{
		if(rear>= Max-1)
		{
			System.out.println("queue is full");
			return;
		}
		else if(rear<0)
		{
			front=0;
			rear=0;
		}
		else
		{
			rear=rear+1;	
		}
		
		a[rear]=new_item;
	}

	public static void delete()
	{
		if(front<0)
		{
			System.out.println("queue is empty");
			return;
		}
		
		else if(front==rear)
		{
			front=-1;
			rear=-1;		
		}
		
		else
		{
			int t=a[front];
			front=front+1;
			System.out.println("Deleted node:"+ t);
		}
		
	}
	
	public static void display()
	{
		if(rear<0)
		{
			System.out.println("queue is empty");
			return;
		}
		else
		{
			System.out.println("Queue formed is....");
			
			for(int i=front; i<=rear; i++)
			{
				System.out.println(a[i]+" ");
			}
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
