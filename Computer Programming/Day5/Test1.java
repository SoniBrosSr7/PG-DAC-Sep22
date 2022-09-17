class Test1{

	
	
	int addition(int x, int y)
	{
		int sum = x+y;
		return sum;
	}
	
	
	public static void main(String args[]){
		
	Test1 t1 = new Test1();
	int add = t1.addition(5,5);//call by value or 
	 
	 System.out.println(add);
	}
	
	
}

