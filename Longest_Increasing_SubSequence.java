import java.util.Arrays;

public class Longest_Increasing_SubSequence 
{
	public static void main(String[] args) 
	{
		int a[]= {10,22,9,33,21,50,41,60};
		
		int l[]= new int[a.length];
		
		Arrays.fill(l,1);
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j])
				{
					l[i]=Math.max(l[i],1+l[j]);
				}
			}
		}
		
		for(int k:l)
		{
			System.out.print(k+" ");
		}
		
		int p=l[0];
		int large=0;
		
		for(int i=1;i<l.length;i++)
		{
			if(p<l[i])
			{
				large=l[i];
			}
		}
		
		System.out.println("\nLength of Longest Increasing Subsequence= "+large);

	}

}
