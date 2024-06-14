
public class No_Of_Triangles
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		int c=0;
		
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]>a[k]) 
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);		
						c++;
					}
				}
			}
		}
		
		System.out.println("No. of Triangles= "+c);

	}

}
