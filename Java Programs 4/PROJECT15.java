
public class PROJECT15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=x++ + ++x + ++x;
		
		int z=--y + x++ + y++;
	
		int p=z++ - (z%10) + (p=z);
		System.out.println(x+" "+y+" "+z+" "+p);

	}

}
