
public class CH_9_EX_Q3 
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
		start=new bt(20);
		bt a=new bt(18);
		bt b=new bt(22);
		bt c=new bt(12);
		bt d=new bt(19);
		bt e=new bt(21);
		last=new bt(24);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=last;
		
		in_order(start);
		delete(start,22);
		System.out.println();
		in_order(start);

	}
	
	public static void in_order(bt root)
	{
		if(root!=null)
		{
			in_order(root.Llink);
			System.out.print(root.info+" ");
			in_order(root.Rlink);
		}
	}
	
	
	public static bt delete(bt root, int value) 
	{
		 bt temp = null;
		 
		 if (root!=null)
		 {
			 if (root.info == value) 
			 {
				 if (root.Llink == null && root.Rlink == null)
				 {
					 return null;
				 }
				 
				 else
				 {
					 if (root.Llink== null)
					 {
						 temp =root.Rlink;
						 return temp;
					 }
					 
					 if (root.Rlink == null)
					 {
						 temp = root.Llink;
						 return temp;
					 }
					 
					 bt minNode = FindMinNode(root.Rlink);
		 
					 int minValue = minNode.info;
					 root.info = minValue;
					 root.Rlink = delete(root.Rlink, minValue);
				 }
			 } 
			
			 else 
			 {
				 if (root.info > value) 
				 {
					 root.Llink = delete(root.Llink, value);
				 }
				 
				 else
				 {
					 root.Rlink = delete(root.Rlink, value);
				 }
			 }
		 	}
		 
		 return temp;
		}
	
		public static bt FindMinNode(bt root)
		{
			bt temp=root;
			
			if (temp == null)
			{
				return null;
			}
		 
			while (root.Llink != null) 
			{
				temp=temp.Llink;
			}
			
			return temp;
		}
}


