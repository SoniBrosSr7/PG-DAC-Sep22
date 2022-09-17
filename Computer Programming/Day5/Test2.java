class Test2{
	//static method
	static int calculate(int l)
	{
		
		return l*l*l;
	}
	
	
	public static void main(String args[]){
	 int x=calculate(7);
	 System.out.println("Volume of cube= "+x);
	 //or
	 System.out.println("Volume of cube= "+calculate(7));
		
		
	/*	
	Test2 t1 = new Test2();
	int v = t1.calculate(5);//call by value or pass by value
	 */
	 
	 //System.out.println("Volume of cube= "+v);
	}
	
	
}

