import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Add
{
	int plot;
	String at;
	int post;
	
	Add(int plot,String at,int post)
	{
		this.plot=plot;
		this.at=at;
		this.post=post;
	}
}
public class TMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Add> t=new TreeMap<String, Add>();
		
//		t.put("Raj",new Integer(23));
//		t.put("Yash",new Integer(90));
//		t.put("Rohan",new Integer(45));
		

		t.put("Raj",new Add(12,"Mumbai",8033));
		t.put("Yash",new Add(34,"Kolkata",8329));
		t.put("Rohan",new Add(89,"Delhi",5873));
		
		Set<Entry<String,Add>> p=t.entrySet();
		
		for(Entry<String,Add> q: p)
		{
			System.out.println(q.getKey()+" --> "+q.getValue());
		}
		

	}

}
