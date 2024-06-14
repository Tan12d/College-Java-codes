
public class Hexadecimal {

	public static void main(String[] args) 
	{
		String a = "0123456789ABCDEF";
		
		char c[]=a.toCharArray();
		
		int t=c[11];
				
		while(t>0)
		{
			t=(char)(t%11);
			
			t/=16;
			
			System.out.print(t);
		}
		
		

	}

}
