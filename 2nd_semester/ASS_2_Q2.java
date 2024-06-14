import java.util.Scanner;

class Student
{
	String name;
	int age;
	float marks;
	Student link;
}

public class ASS_2_Q2 
{
	static Student start=null;
	static Student last=null;
	static int count=0;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		
		Student s=new Student();
		System.out.println("Enter the info of first Student:");
		System.out.println("Enter name:");
		s.name=sc.next();
		System.out.println("Enter age:");
		s.age=sc.nextInt();
		System.out.println("Enter marks:");
		s.marks=sc.nextFloat();
		start=s;
		s.link=null;
			
		System.out.println("Do you want to add the info of more Students?(y/n)");
		char c=sc.next().charAt(0);
		
		last=start;
		System.out.println("Enter the info of next Student:");
		
		while(c=='y'||c=='Y')
		{
			s=new Student();			
			System.out.println("Enter name:");
			s.name=sc.next();
			System.out.println("Enter age:");
			s.age=sc.nextInt();
			System.out.println("Enter marks:");
			s.marks=sc.nextFloat();
			s.link=null;
			
			last.link=s;
			last=s;
			
			System.out.println("Do you want to add the info of more Students?(y/n)");
			c=sc.next().charAt(0);
		}		
	}
	
	public static void display()
	{
		if(start==null)
		{
			System.out.println("There is no student");
		}
		
		else
		{
			Student t=start;
			
			while(t!=null)
			{
				System.out.print("Name: "+t.name+" "+"Age: "+t.age+" "+"Marks: "+t.marks+" --> ");
				System.out.println();
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
			Student t=start;
			int c=0;
			
			while(t!=null)
			{
				c++;
				t=t.link;
			}
			
			count=c;
			return c;
		}
	}
	
	public static void delete_at_any(String value,int age1,float marks1)
	{
		if(start==null)
		{
			System.out.println("There is no student");
		}
		
		else if(count<=2)
		{
			Student t=start;
			start=start.link;
			t.link=null;
			
			System.out.println("Removed Student: Name: "+t.name+" Age: "+t.age+" Marks: "+t.marks);
		}
		
		else
		{
			Student t=start;
			Student prev=null;
			
			while(t!=null && (t.name.equals(value)==false && t.age!=age1 && t.marks!=marks1))
			{
				prev=t;
				t=t.link;
			}
			
			if(t==null)
			{
				System.out.println("There is no student named "+value);
			}
			
			else
			{
				prev.link=t.link;
				t.link=null;
				
				System.out.println("Removed Student: Name: "+t.name+" Age: "+t.age+" Marks: "+t.marks);				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		create();
		
		System.out.println()
		;
		display();
		
		System.out.println();
		
		System.out.println("Number of Students= "+count());
		
		System.out.println();
		
		System.out.println("Enter the info of the student you want to remove:");
		String value=sc.next();
		int age1=sc.nextInt();
		float marks1=sc.nextFloat();
		delete_at_any(value,age1,marks1);
		
		System.out.println();
		
		display();

	}

}
