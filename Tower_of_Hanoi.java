
public class Tower_of_Hanoi 
{
	public static void toh(int n,char A,char B,char C)
	{
		if(n==1)
		{
			System.out.println("disk "+n+" from "+A+" to "+C);
		}
		
		else
		{
			toh(n-1,A,C,B);
			System.out.println("disk "+n+" from "+A+" to "+C);
			toh(n-1,B,A,C);
		}
	}
	
	public static void main(String[] args) 
	{
		int n=5;
		
		toh(n,'A','B','C');		
	}

}
