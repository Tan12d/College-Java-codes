
public class Approximate_String_Matching 
{
    public static void approx(String s1,String s2)
    {
    	int r=s1.length()+1;
    	int c=s2.length()+1;
    	
    	int m[][]=new int[r][c];
    	
        char t[][]=new char[r][c];
        
        t[0][0]='+';
    	
    	for(int i=1;i<=s1.length();i++)
    	{
    		m[i][0]=i; 
    		t[i][0]='-';
    	}
    	
    	for(int j=1;j<=s2.length();j++)
    	{
    		m[0][j]=j;
    		t[0][j]='|';
    	}
    	
    	for(int i=1;i<r;i++)
    	{
    		for(int j=1;j<c;j++)
    		{
    			if(s1.charAt(i-1)==s2.charAt(j-1))
    			{
    				m[i][j]=min(m[i-1][j-1]+0,m[i-1][j]+1,m[i][j-1]+1);
    				
    				t[i][j]='*';    				
    			}
    			
    			else
    			{
    				m[i][j]=min(m[i-1][j-1]+1,m[i-1][j]+1,m[i][j-1]+1);
    				
    				if(m[i][j]==m[i-1][j-1]+1)
    				{
    					t[i][j]='*';
    				}
    				
    				else if(m[i][j]==m[i-1][j]+1)
    				{
    					t[i][j]='|';
    				}
    				
    				else if(m[i][j]==m[i][j-1]+1)
    				{
    					t[i][j]='-';
    				}
    			}
    		}
    	}
    	
    	for(int i=0;i<=s1.length();i++)
    	{
    		for(int j=0;j<=s2.length();j++)
    		{
    			System.out.print(m[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    	System.out.println();
    	
    	for(int i=0;i<=s1.length();i++)
    	{
    		for(int j=0;j<=s2.length();j++)
    		{
    			System.out.print(t[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    	char y[]=new char[s2.length()];
    	
    	int p=0;
    	
    	int x=r-1,v=c-1;

    	while(x>0 && v>0)
    	{
    		if(t[x][v]=='*')
    		{
    			y[p++]=s2.charAt(v-1);
    			x--;
    			v--;
    		}
    		
    		else if(t[x][v]=='|')
    		{
    			y[p++]=s2.charAt(v-1);
    			x--;
    		}
    		
    		else if(t[x][v]=='-')
    		{
    			y[p++]=s2.charAt(v-1);
    			v--;
    		}
    	}
    	
    	System.out.println();
    	
    	for(int q=y.length-1;q>=0;q--)
    	{
    		System.out.print(y[q]);
    	}
    }
    
    public static int min(int a,int b,int c)
    {
    	if(a<=b && a<=c)
    	{
    		return a;
    	}
    	
    	else if(b<=a && b<=c)
    	{
    		return b;
    	}
    	    	
    	else if(c<=a && c<=b)
    	{
    		return c;
    	}
    	
    	return 0;
    }
    
	public static void main(String[] args) 
	{
		String s1="numpy";
		
		String s2="numexpr";
		
		approx(s1,s2);
	}

}
