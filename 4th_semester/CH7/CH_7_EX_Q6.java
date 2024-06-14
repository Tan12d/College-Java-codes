
public class CH_7_EX_Q6 
{
	public static boolean pal(char c[])
	{
		int i=0,j=c.length-1;
		
		while(i<=j)
		{
			if(!(c[i]>=97 && c[i]<=122))
				i++;
			
			else if(!(c[j]>=97 && c[j]<=122))
				j--;
			
			else if(c[i]==c[j])
			{
				i++;
				j--;
			}
			
			else 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		String s="Madam I'm Adam";
		s=s.replace(" ","");
		
		s=s.toLowerCase();

		char c[]=s.toCharArray();
				
		System.out.println(pal(c));
	}

}
