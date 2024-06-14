import java.util.LinkedList;
import java.util.Queue;

public class is_MaxHeap
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
		start=new bt(80);
		bt a=new bt(10);
		bt b=new bt(22);
		bt c=new bt(6);
		bt d=new bt(8);
		bt e=new bt(18);
		last=new bt(20);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=last;
		
		isCompleteBT(start);
		
		System.out.println(isHeap(start));;
	}
	
	public static boolean isCompleteBT(bt root)
	{
	    if (root == null)
	        return true;
	   
	    Queue<bt> q = new LinkedList<>();
	    
	    q.add(root);
	    
	    boolean flag = false;
	   
	    while(!q.isEmpty())
	    {
	        bt temp =q.peek();
	        q.remove();
	   
	        if(temp == null)
	        {
	            flag = true;
	        }
	        
	        else
	        {
	            if(flag == true)
	            {
	                return false ;
	            }
	        
	            q.add(temp.Llink) ;            
	            q.add(temp.Rlink) ;
	        }    
	    }
	    return true;
	}
	
	public static boolean isHeap(bt root)
	{
		int infi=Integer.MAX_VALUE;
		
		return (isCompleteBT(root) && isHeapUtil(root,infi));
	}

	public static boolean isHeapUtil(bt root,int infi)
	{
		if (root == null)
			return true;
		
		if (root.info > infi)
			 return false;
		
		return (isHeapUtil(root.Llink, root.info) && isHeapUtil(root.Rlink,root.info));
	}

}
