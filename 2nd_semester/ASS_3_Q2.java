import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Address
{
	int plotNo;
	String at;
	int postNo;
	
	public Integer getI()
	{
		return plotNo;
	}
	
	public String getS()
	{
		return at;
	}
	
	public Integer getId()
	{
		return postNo;
	}
	
	public String toString()
	{
		return "["+this.getI()+" -> "+this.at+" -> "+this.postNo+"]";
	}
}

public class ASS_3_Q2 
{
	public static void main(String[] args)
	{
		HashMap<String,Address> hs=new HashMap<String,Address>();
		
		Address a1=new Address();
		a1.plotNo=4510;
		a1.at="Mumbai";
		a1.postNo=400010;
		
		Address a2=new Address();
		a2.plotNo=6832;
		a2.at="Kolkata";  
		a2.postNo=700013;
		
		hs.put("Raj", a1);
		hs.put("Rohan", a2);
		
		Set<Entry<String,Address>> s=hs.entrySet();
		
		for(Entry<String,Address> w:s)
		{
			System.out.println(w.getKey()+" => "+w.getValue());
		}

	}

}
