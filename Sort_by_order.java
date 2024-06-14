import java.util.HashMap;

public class Sort_by_order {
	
	public static void SortByOrder(int a[],int b[],int m,int n) 
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		int value=0;
		
		for(int i=0;i<m;i++)
		{
			if(h.containsKey(a[i]))
			{
				value=h.get(a[i]);
				h.put(a[i],value+1);				
			}
			
			else
			{
				h.put(a[i],1);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(h.containsKey(b[i]))
			{
				value=h.get(b[i]);
			}
			
			for(int k=0;k<value;k++)
			{
				System.out.print(b[i]+" ");
			}
			
			h.remove(b[i]);
		}
		
		
		 for (int i = 0; i < m; i++) 
		 {
			 if (h.containsKey(a[i]))
			 {
				 value = h.get(a[i]);
				 for (int k = 0; k < value; k++)
				 {
					 System.out.print(a[i]+" ");
				 }
				 h.remove(a[i]);
			 }			 
		}	
	}

	public static void main(String[] args) 
	{
		 int a[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		 int b[] = { 2, 1, 8, 3 };
		 SortByOrder(a,b,a.length,b.length);
	}

}
