
public class frequency_sort {

	public static void main(String[] args)
	{
		int a[]= {2,2,5,5,6,8,8,8};
		
		int max=-1;
		
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(max,a[i]);
		}
		
		int freq[]=new int[max+1];
		
		for(int i=0;i<a.length;i++)
		{
			freq[a[i]]++;
		}
		
		int cnt=0;
		
		for(int i=0;i<=max;i++)
		{
			if(freq[i]>0)
			{
				int value = 100000 - i;
	            a[cnt] = 100000 * freq[i] + value;
	            cnt++;
			}
		}
	}

}
