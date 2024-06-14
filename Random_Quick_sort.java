
public class Random_Quick_sort {

	public static void main(String[] args)
	{
		int a[]= {1,6,4,7,2,9};

		Randomized_Qs(a,0,a.length-1);
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

	public static void Randomized_Qs(int a[],int l,int h)
	{
		if(l<h)
		{
			int q=Randomized_partition(a,l,h);
			Randomized_Qs(a,l,q-1);
			Randomized_Qs(a,q+1,h);
		}
	}
	
	public static int Randomized_partition(int a[],int l,int h)
	{
		int x=(int) (Math.random() * (h - l + 1) + l);
		
		int t=a[x];
		a[x]=a[h];
		a[h]=t;
		
		int s=partition(a,l,h);
		
		return s;
	}
	
	public static int partition(int a[],int l,int h)
	{
		int pivot=a[h];
		
		int i=l;
		int j=l;
		
		while(i<=h)
		{
		   if(a[i]<=pivot)
		   {
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			   
			   j++;
			   i++;
		   }   
		   
		   else
		   {
			   i++;
		   }
		}
	
		return j-1;
	}
}
