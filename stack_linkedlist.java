import java.util.Scanner;

class stack_node
{
	int info;
	stack_node link;
}
public class stack_linkedlist
{
	static stack_node TOP=null;

	public static boolean isEmpty()
	{
		if(TOP == null)
			return true;
		
		else
			return false;
	}
	
	public static void PUSH(int data)
	{
		Scanner sc=new Scanner(System.in);
		stack_node n=new stack_node();
		n.info=data;
		n.link=TOP;
		TOP=n;
	}
	
	public static void POP()
	{
		if(TOP==null)//if(TOP<0)
		{
			System.out.println("stack is empty");
			return;
		}
		else
		{
			stack_node t=TOP;
			TOP=TOP.link;
			t.link=null;
			System.out.println("Popped item: "+t.info);
		}
	}
	
	public static void PEEK()
	{
		if(TOP==null)
		{
			System.out.println("stack is empty");
			return;
		}
		else
		{
			System.out.println("TOP item: "+TOP.info);
		}
	}
	
	public static void display()
	{
		if(TOP==null)
		{
			System.out.println("stack is empty");
			return;
		}
		else
		{
			stack_node t=TOP;
			while(t!=null)
			{
				System.out.println(t.info+" --> ");
				t=t.link;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("Enter the info of node:");
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
			
			System.out.println("Do you want to pop more?(y/n)");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'|| ch=='Y');
		
		PEEK();

	}
}
