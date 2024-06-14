
public class number_permutation
{
	public static void main(String[] args) 
	{
		int n=123;
		
		String a=Integer.toString(n);
		
		permute("",a);
	}
	
	public static void permute(String a,String b)
	{
		if(b.length()==0)
		{
			System.out.println(a);
			return;
		}
		
		else
		{
			for(int i=0;i<b.length();i++)
			{
				char c=b.charAt(i);
				
				String x=b.substring(0, i);
				String y=b.substring(i+1);
				String z=x+y;
				
				permute(a+c,z);
			}
		}
	}

}
