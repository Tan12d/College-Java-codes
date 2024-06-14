import java.util.HashSet;

public class Union_Intersection_of_array
{
	public static void union_intersection(int a[],int b[],int m,int n)
	{
		int i=0,j=0;
		
		int unionarr[]=new int[m+n];
	
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(i=0;i<m;i++)
		{
			h.add(a[i]);
		}
		
		System.out.println("Intersection: ");
		for(j=0;j<a.length;j++)
		{
			if(h.contains(b[j]))
			{
				System.out.print(b[j]+" ");
			}
		}
		
		for(int k=0;k<m;k++)
		{
			unionarr[k]=a[k];
		}
		int p=0;
		
		for(int l=m;l<unionarr.length;l++)
		{
			unionarr[l]=b[p++];
		}
		
		HashSet<Integer> h1=new HashSet<Integer>();
		
		for(int w=0;w<unionarr.length;w++)
		{
			h1.add(unionarr[w]);
		}
		
		System.out.println("\nUnion: ");
		
		System.out.print(h1);
		
		
	}
	
	public static void main(String[] args) 
	{
		int a[]= {2,4,9,5,8};
		
		int b[]= {7,6,2,1,5};
		
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		for(int c:b)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		union_intersection(a,b,a.length,b.length);

	}

}
