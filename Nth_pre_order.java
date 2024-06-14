

public class Nth_pre_order 
{
	static class bt
	{
		int info;
		bt Llink;
		bt Rlink;
		
		bt(int info)
		{
			this.info=info;
			this.Llink=null;
			this.Rlink=null;
		}
	}
	
	static bt start=null;
	static bt last=null;
	
	public static void main(String[] args) 
	{
		start=new bt(5);
		bt a=new bt(7);
		bt b=new bt(9);
		bt c=new bt(6);
		bt d=new bt(2);
		bt e=new bt(18);
		last=new bt(4);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=last;
		
		int counter[]= {0};
		nth_pre_Order(start,5,counter);
	}

	public static void nth_pre_Order(bt root,int index,int counter[])
	{
		if (root != null)
		{
			 counter[0]++;
			 
			 if (counter[0] == index) 
			 {
				 System.out.print(root.info);
			 }
			 
			 nth_pre_Order(root.Llink, index, counter);
			 nth_pre_Order(root.Rlink, index, counter);
		}
	}
}
