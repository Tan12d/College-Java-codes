
public class Stock_purchase_Sell
{
	public static void main(String[] args) 
	{
		int stocks[]= {3,5,7,4,2,8,5,9};
		
		int buy=0,sell=0,currmin=0,currprofit=0,maxprofit=0;
		
		for(int i=0;i<stocks.length;i++)
		{
			if(stocks[i]<stocks[currmin])
			{
				currmin=i;
			}
			
			currprofit=stocks[i]-stocks[currmin];
			
			if(currprofit>maxprofit)
			{
				buy=currmin;
				sell=i;
				maxprofit=currprofit;
			}
				
		}
		System.out.println("Purchase day is- "+buy+ "at price "+stocks[buy]);
		System.out.println("Sell day is- " +sell+"at price " +stocks[sell]);
		System.out.println(maxprofit);
		}

}