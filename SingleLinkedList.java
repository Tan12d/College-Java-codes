import java.util.LinkedHashSet;
import java.util.Scanner;

class N0de
{
	int info;
	N0de link;
}

public class SingleLinkedList 
{
	static N0de start=null;
	static N0de last=null;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		N0de n=new N0de();
		System.out.println("Enter the info of first node:");
		n.info=sc.nextInt();
		start=n;
		n.link=null;
		
		System.out.println("Do you want to add more nodes?(y/n)");
		char ch=sc.next().charAt(0);
		
		last=start;
		
		while(ch=='y'|| ch=='Y')
		{
			n=new N0de();
			System.out.println("Enter the info of next node:");
			n.info=sc.nextInt();
			n.link=null;
			
			last.link=n;
			last=n;
			
			System.out.println("Do you want to add more nodes:");
			ch=sc.next().charAt(0);
		}
	}

	public static void display()
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		else
		{
			System.out.println("\nThe list you have created is...");
			N0de t=start;
			while(t!=null)
			{
				System.out.print(t.info+ " --> ");
				t=t.link;
			}
		}
	}
	
	public static int count()
	{
		if(start==null)
		{
			return 0;
		}
		else
		{
			N0de t=start;
			int c=0;
			while(t!=null)
			{
				c++;
				t=t.link;
			}
			return c;
		}
	}
	
	public static void insert_at_beg(int data)
	{
		N0de n=new N0de();
		n.info=data;
		
		if(start==null)
		{
			System.out.println("No free space");
			return;
		}
		else
		{
			n.link=start;
			start=n;
		}
		
	}
	
	public static void insert_at_end(int data)
	{
		N0de n=new N0de();
		n.info=data;
		
		if(start==null)
		{
			System.out.println("No free space");
		}
		else
		{
			n.link=null;
			last.link=n;
			last=n;
		}
	}
	
	public static void insert_at_any(int data,int key)
	{
		N0de n=new N0de();
		n.info=data;
		
			N0de t=start;
			while(t!=null && t.info!=key)
			{
				t=t.link;
			}
			
			if(t==null)
			{
				System.out.println("The node " + key + " is "
						+ "not present in the list");
			}
			else
			{
				n.link=t.link;
				t.link=n;
			}		
	}
	
	public static void delete_at_beg()
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		else
		{
			N0de t=start;
			start=start.link;
			t.link=null;
			
			System.out.println("\nDeleted node= "+t.info);
			
		}
	}
	
	public static void delete_at_end()
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		else
		{
			N0de t=start;
			N0de prev=null;
			while(t.link!=null)
			{
				prev=t;
				t=t.link;
			}
			
			prev.link=null;
			last=prev;
			System.out.println("\nDeleted node= "+t.info);
		}
	}
	
	public static void delete_at_any(int key)
	{
		if(start==null)
		{ 
			System.out.println("list is empty");
			return;
		}
		else
		{
			N0de t=start;
			N0de prev=null;
			while(t!=null && t.info!=key)
			{
				prev=t;
				t=t.link;
			}
			
			if(t==null)
			{
				System.out.println("The node is not present in the list");
			}
			else
			{
				prev.link=t.link;
				t.link=null;
				System.out.println("Deleted node= "+t.info);
			}
		}
	}
	public static void sorting()
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		else
		{
			for(N0de i=start;i.link!=null;i=i.link)
			{
				for(N0de j=i.link;j!=null; j=j.link)
				{
					if(j.info < i.info)
					{
						int t=i.info;
						i.info=j.info;
						j.info=t;
					}
				}
			}
		}
	}
	
	public static int search(int element)
	{
		int p=0;
		N0de t=start;
		
		while(t!=null)
		{
			p++;
			if(t.info== element)
			{
				return p;
			}
			t=t.link;
			
		}
		return -1;
	}
	
	public static void reverse()
	{
		if(start == null)
		{
			System.out.println("List is empty");
			return;
		}
		
		else if( start.link==null)
		{
			System.out.println("List contains only one element");
			return;
		}
		
		else
		{
			N0de t= start;
			N0de prev= null;
			N0de next =null;
			
			while(t!= null)
			{
			    next = t.link;
				t.link=prev;
				prev=t;
				t=next;
			}
			start= prev;
		}
	}
	
	public static void middle_n0de()
	{
		N0de slow=start;
		N0de fast=start;
		
		while(fast!=null && fast.link!=null)
		{
			slow=slow.link;
			fast= fast.link.link;
		}
		
		System.out.println("Middle node= "+slow.info);
	}
	
	public static void nth_n0de_from_end(int n)
	{
		N0de main=start;
		N0de ref=start;
		
		int count=0;
		
		while(count<n)
		{
			ref=ref.link;
			count++;
		}
		
		while(ref!=null)
		{
			ref=ref.link;
			main=main.link;
		}
		
		System.out.println(n+ "st/nd/rd/th node from end= "+main.info);
	}
	
	public static void remove_duplicates()
	{
		LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
		
		N0de t=start;
		
		while(t!=null)
		{
			a.add(t.info);
			t=t.link;
		}
		
		for(Integer i:a)
		{
			System.out.print(i+" --> ");
		}
	}
	
	public static void Insertion_in_Sorted_SLL(int data)
	{
		N0de n=new N0de();
		n.info=data;
		
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		else
		{
			N0de t=start;
			N0de prev=null;
			
			while(t!=null && t.info<data)
			{
				prev=t;
				t=t.link;
			}
			
			if(t==null)
			{
				System.out.println(data+ " is not present in the list ");
			}
			
			else
			{
				n.link=prev.link;
				prev.link=n;		
			}
		}
	}
	
	public static void Insertion_at_any_position(int position,int data)
	{
		N0de n=new N0de();
		n.info=data;
		
		if(position==1)
		{
			n.link=start;
			start=n;
		}
		
		else
		{
			N0de t=start;
			int count =1;
			while(count < position-1)
			{
				t=t.link;
				count++;
			}
			
			n.link=t.link;
			t.link=n;
		}
	}
	
	public static void Delete_at_any_position(int position)
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		else
		{
			N0de t=start;
			N0de prev=null;
			int count =1;
			while(count<position)
			{
				prev=t;
				t=t.link;
				count++;
			}
			
			prev.link=t.link;
			t.link=null;
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		create();
		display();
		System.out.println("\nTotal number of nodes= "+ count());
		
//		
//		int data1=sc.nextInt();
//		insert_at_beg(data1);
//		display();
//			
		
//		int data2=sc.nextInt();
//		insert_at_end(data2);
//		display();
//		
//		
//		System.out.println("\nEnter the info of which you want to add at any position");
//		int data3=sc.nextInt();
//		System.out.println("Enter the node after which you want to add");
//		int key=sc.nextInt();
//		insert_at_any(data3,key);
//		display();
//				
//		delete_at_beg();
//		display();
//			
//		
//		delete_at_end();
//		display();
//		
//
//		System.out.println("\nEnter the info of which you want to delete at any position");
//		 
//		int key1=sc.nextInt();
//		delete_at_any(key1);
//		display();
//				
//		System.out.println("Sorting");
//		sorting();
//		display();
//		
//		int element=sc.nextInt();
//		System.out.println("\nValue you want to search: "+ search(element));
//			
//		reverse();
//		display();
//		
//	    middle_n0de();
		
//		nth_n0de_from_end(2);
		
//		remove_duplicates();
		
//		Insertion_in_Sorted_SLL(56);
//		display();
		
//		Insertion_at_any_position(3,98);
//		display();
		
		Delete_at_any_position(3);
		display();
	}

}
