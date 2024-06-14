
public class moving_zeroes_to_end 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,0,0,0,9,0,4,6,6,0,0,0,7,3,1,8};
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0 && a[j]==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			if(a[j]!=0)
			{
				j++;
			}
		}
		
		for(int y:a)
		{
			System.out.print(y+" ");
		}

//		Arrays.sort(a);
//		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.print(a[i]+" ");
//		}
	}

}
