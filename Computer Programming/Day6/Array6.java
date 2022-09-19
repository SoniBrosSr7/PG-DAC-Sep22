
class Array6{
		 
	public static void main(String args[]){
		
		int a[]={1,2,3,4,6};
		int b[]={4,5,6};
		int c[]={7,8,9};
		
		int a1[][] = new int[3][];
		int a2[][] = new int[3][];
		
		a1[0] = a;
		a1[1] = b;
		a1[2] = c;
		
		a2[0] = c;
		a2[1] = b;
		a2[2] = a;
	
		for(int i=0;i<a1.length;i++)//Rows
		{
			for(int j=0;j<a1[i].length;j++)//cols
		{
				System.out.print(" "+a1[i][j]);
		}
		System.out.println();
		}
		
		for(int i=0;i<a2.length;i++)//Rows
		{
			for(int j=0;j<a2[i].length;j++)//cols
		{
				System.out.print(" "+a2[i][j]);
		}
		System.out.println();
		}
	
	}

	
}

