
public class CH_6_EX_Q3 
{
	static class n
	{
		int info;
		n link;
		
		n(int info)
		{
			this.info=info;
			this.link=null;
		}
	}
	
	static n start=null;
		
	public static void main(String[] args)
	{
		start=new n(10);
		n second=new n(12);
		n third=new n(14);
		n fourth=new n(16);
		n fifth=new n(18);
		n sixth=new n(20);
		
		start.link=second;
		second.link=third;
		third.link=fourth;
		fourth.link=fifth;
		fifth.link=sixth;
		sixth.link=third;
		
		remove();
		display();

	}
	
	public static void display()
	{
		n t=start;
		
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null)
			{
				System.out.print(t.info+" -> ");
				t=t.link;
			}
		}
	}
	
	public static void remove()
	{
		n slow=start;
		n fast=start;
		
		while(fast!=null && fast.link!=null)
		{
			slow=slow.link;
			fast=fast.link.link;
			
			if(slow==fast)
			{
				fast.link.link=null;
			}
		}
	}

}
