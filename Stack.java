import java.util.Scanner;

public class Stack 
{
	static int Max=10;
	static int a[]=new int[Max];
	static int TOP=-1;

	public static boolean isFull()
	{
		if(TOP >= Max-1)
			return true;
		else
			return false;
	}
	
	public static boolean isEmpty()
	{
		if(TOP < 0)
			return true;
		else
			return false;
		
	}
	
	public static void PUSH(int data)
	{
		if(isFull()==true)//if(TOP>=Max-1)
		{
			System.out.println("stack is full");
			return;
		}
		else
		{
			System.out.println("Enter the item:");
			TOP=TOP+1;
			a[TOP]=data;
		}
	}
	
	public static void POP()
	{
		if(isEmpty()==true)//if(TOP<0)
		{
			System.out.println("stack is empty");
			return;
		}
		else
		{
			int t=a[TOP];
			TOP=TOP-1;
			System.out.println("Popped item: "+t);
		}
	}
	
	public static void PEEK()
	{
		if(isEmpty()==true)
		{
			System.out.println("stack is empty");
			return;
		}
		else
		{
			System.out.println("TOP item: "+a[TOP]);
		}
	}
	
	public static void display()
	{
		if(isEmpty()==true)
		{
			System.out.println("stack is empty");
			return;
		}
		else
		{
			for(int i=TOP;i>=0; i--)
			{
				System.out.println(a[i]+" --> ");
			}
		}
	}
	
	public static int count()
	{
		return TOP+1;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("Enter the item u want to push");
			int data1=sc.nextInt();
			PUSH(data1);
			System.out.println("new stack:");
			display();
			
			System.out.println("Do you want to push more?(y/n)");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'|| ch=='Y');
		
		do
		{
			POP();
			display();
			
			System.out.println("Do you want to push more?(y/n)");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'|| ch=='Y');
		
		PEEK();
		
        System.out.println("Total nodes= "+count());
        
	}

}
