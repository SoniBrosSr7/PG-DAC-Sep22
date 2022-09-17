public class Test4{
	
	static int x = 20;//static variable
		
	//non static method
	public void display()
	{
		System.out.println("Instance Method");
		
	}
	
	//static method
	public static void show()
	{
		System.out.println("Static Method");
		//System.out.println(y);//Error
		
	}
	
	public static void main(String args[]){
		Test4 t1 = new Test4();
		t1.display();
		Test4 t2 = null;
		show();
		int a = t2.x;
		
		System.out.println(x);
	 

	}
	
	
}

