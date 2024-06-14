import java.util.ArrayDeque;

public class CH_8_EX_Q7 
{
	public static int opt(int s,int t)
	{
		ArrayDeque<Integer> b=new ArrayDeque<Integer>();
		
		int a[]=new int[100];
		int steps=0,value=0,i=0;
		
		b.add(s);
		
		while(b.size()!=0)
		{
			value=b.remove();
			a[i++]=value;
			
			if(value==t)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(a[j]+" ");
				}
				
				System.out.println();
				
				return steps;
			}
			
			steps++;
			
			if(value<t)
			{
				b.add(value*2);
			}
			
			else
			{
				b.add(value-1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Steps= "+opt(4,9));
	}

}
