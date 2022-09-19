class Student1{
	
	 int id;
	 String name;
	 int marks;
	
	//default constructor
	Student1()
	{
		id=111;
		name="Tushar";
		marks=89;
	}
	//parameterised constructor
	Student1(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	
	Student1(int id, String name )
	{
		this.id=id;
		this.name=name;
	
	}
	//static method
	void display()
	{
		System.out.println("Id= "+id);
		System.out.println("Name= "+name);
		System.out.println("Marks= "+marks);
	}
	
	public static void main(String args[]){
		
		Student1 s1  = new Student1();
		s1.display();
		Student1 s2  = new Student1(555,"Saurav", 91);
		s2.display();
		
		Student1 s3  = new Student1(333,"Pragati");
		s3.display();
		s1.display();
		
	  

	}

	
}

