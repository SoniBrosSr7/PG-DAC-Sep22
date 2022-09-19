class Array2{
		 
	public static void main(String args[]){
		
	int[]a1={10,20,30,40,50};
		
		
		//for each loop
		for(int x:a1)
		{
			System.out.println(x);
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Index "+i+"="+a1[i]);
		}
		
		a1[4]=100;
	  
		System.out.println(a1[4]);
	}

	
}

