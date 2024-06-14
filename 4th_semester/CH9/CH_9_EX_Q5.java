import java.util.LinkedList;
import java.util.Queue;

public class CH_9_EX_Q5 
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
//		bt e=new bt(18);
		last=new bt(4);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
//		b.Llink=e;
		b.Llink=last;
		
		System.out.println(isCompleteBT(start));
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
}
