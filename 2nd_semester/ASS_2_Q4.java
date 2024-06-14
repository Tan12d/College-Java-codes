import java.util.Stack;

public class ASS_2_Q4 {
	public static void main(String[] args) 
	{
		String s="596-4*21^/+";
		
		char c[]=s.toCharArray();
		
		Stack<Float> p=new Stack<Float>();
	
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=48 && c[i]<=57)
			{
				p.push(Float.valueOf(c[i])-48);
			}
			
			else if(c[i]=='+'||c[i]=='-'||c[i]=='*'||c[i]=='/'||c[i]=='^')
			{
				float a=Float.valueOf(p.pop());
				float b=Float.valueOf(p.pop());
				
				
				float d=0;

					switch(c[i])
					{
					case '+':
						d=a+b;
						p.push(d);
						break;
					case '-':
						d=b-a;
						p.push(d);						
						break;
					case '*':
						d=a*b;
						p.push(d);
						break;
					case '/':
						d=b/a;
						p.push(d);						
						break;
					case '^':
						d=(float) Math.pow(b,a);
						p.push(d);						
						break;
					}
					
				}
		}
		
		System.out.println(p);

	}
}
