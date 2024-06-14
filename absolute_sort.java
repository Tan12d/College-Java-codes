
public class absolute_sort {

	public static void sort(int a[],int ref)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(Math.abs(a[j]-ref)>Math.abs(a[j+1]-ref))
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		
		int ref=5;
		
		sort(a,ref);

		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}

}
