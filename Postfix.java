import java.util.Stack;

public class Postfix 
{
	public static void main(String[] args)
	{
		String s="596-4*21^/+";
		
	    char c[]=s.toCharArray();
	    
	    Stack<Float> t=new Stack<Float>();
	    
	    for(int i=0;i<c.length;i++)
	    {
	    	if(c[i]>=48 && c[i]<=57)
	    	{
	    		t.push(Float.valueOf(c[i])-48);
	    	}
	    	
	    	else if(c[i]=='+'||c[i]=='-'||c[i]=='*'||c[i]=='/'||c[i]=='^')
	    	{
	    		float x=Float.valueOf(t.pop());
	    		float y=Float.valueOf(t.pop());
	    		
	    		float d=0;
	    		
	    		switch(c[i])
	    		{
	    		case '+':
	    			d=x+y;
	    			t.push(d);
	    			break;
	    		case '-':
	    			d=y-x;
	    			t.push(d);
	    			break;
	    		case '*':
	    			d=x*y;
	    			t.push(d);
	    			break;
	    		case '/':
	    			d=y/x;
	    			t.push(d);
	    			break;
	    		case '^':
	    			d=(float)Math.pow(y,x);
	    			t.push(d);
	    			break;	    			
	    		}
	    	}
	    }

	    System.out.println(t);
	}

}
