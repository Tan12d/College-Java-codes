
public class Weighted_Interval_Scheduling 
{
	public static void find_solution(int id[],int m[],int p[],int s[],int f[],int w[],int i)
	{
		if(i==0)
		{
		    System.out.println("}");
			System.exit(0);
		}
			
		else
		{
			
			if(w[i]+m[p[i]]>m[i-1] )
			{
				System.out.print(i+",");
				find_solution(id,m,p,s,f,w,p[i]);
			}
			
			else
			{
				find_solution(id,m,p,s,f,w,i-1);
			}
		}
	}
		
	public static void main(String[] args) 
	{
		int id[]= {0,1,2,3,4,5,6,7,8};
		
		int s[]= {0,1,3,4,5,6,8,8,7};
		
		int f[]= {0,4,5,6,7,8,10,11,12};
		
		int w[]= {0,3,7,1,3,7,2,10,10};
		
        int m[]=new int[s.length];
		
		int p[]=new int[s.length];
		
		for(int i=1;i<s.length;i++)
		{
			for(int j=i-1;j>=1;j--)
			{
				if(f[j]<=s[i])
				{
					p[i]=j;
					break;
				}
			}
			
			m[i]=Math.max(w[i]+m[p[i]],m[i-1]);			
		}
		
		System.out.print("Maximum Weight="+m[m.length-1]);
		
		System.out.println("\n\nJobs selected= {");
		for(int i=id.length-1;i>=0;i--)
		{				
			find_solution(id,m,p,s,f,w,id[i]);
		}
		
	}

}
