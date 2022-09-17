class Test3{
	
	static int x = 20;//static variable
	int y = 30;//instance variable
	
	//non static method
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		show();
	}
	
	//static method
	static void show()
	{
		System.out.println(x);
		//System.out.println(y);//Error
	}
	
	public static void main(String args[]){
		Test3 t1 = new Test3();
		t1.display();
		show();
	 

	}
	
	
}

