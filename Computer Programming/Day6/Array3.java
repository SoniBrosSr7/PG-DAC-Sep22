class Array3{
		 
	public static void main(String args[]){
		
	int[]a1={10,20,30,40,50};
		
		
			
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Index "+i+"="+a1[i]);
		}
		
		
		//for each loop
		for(int x:a1)
		{
			System.out.println(x);
		}
		a1[4]=100;
	  
		System.out.println(a1[4]);
	}

	
}

