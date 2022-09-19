class Operation1{
	private int x;
	public static int sum(int i, int j)
	{
		return i+j;
	}
	//No of parameters
	public static int sum(int i, int j, int k)
	{
		return i*j*k;
	}
	
	public static double sum(double i, int j, double k)
	{
		return i*j*k;
	}
	
}

class Operation3{	
	public static void main(String args[]){
		//Operation1 op1 =new Operation1();
				
	    System.out.println(Operation1.sum(1.1,2.2,3));

	}

	
}

