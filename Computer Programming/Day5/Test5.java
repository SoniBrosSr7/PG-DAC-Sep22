public class Test5{
	
	static int x = 20;//static variable
		
	static int change()
	{
		
		return x;
	}
	
	public static void main(String args[]){
		System.out.println(x);
		int a = change();
		
		System.out.println(a);
	    System.out.println(x);

	}
	
	
}

