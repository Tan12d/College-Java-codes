
public class partition_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,0,0,1,1,0,0,0,1,0,1,0};
		
		int i=0,j=0,k=a.length-1;
		
		while(i<k)
		{
			if(a[i]!=0 && a[j]==0)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				
				i++;
				j++;
			}
			
			else if(a[j]==0)
			{
				i++;
			}
		}
		
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}

}
