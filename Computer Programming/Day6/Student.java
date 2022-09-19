class Student{
	
	 int id;
	 String name;
	 int marks;
	
	//default constructor
	Student()
	{
		id=111;
		name="Tushar";
		marks=89;
	}
	//parameterised constructor
	Student(int s1, String s2, int s3)
	{
		id=s1;
		name=s2;
		marks=s3;
	}
	//static method
	void getdata(int id1, String name1, int marks1)
	{
		id=id1;
		name=name1;
		marks=marks1;
	}
	//non-static method
	void display()
	{
		System.out.println("Id= "+id);
		System.out.println("Name= "+name);
		System.out.println("Marks= "+marks);
	}
	
	public static void main(String args[]){
		
		Student s1  = new Student();
		s1.display();
		Student s2  = new Student(555,"Saurav", 91);
		s2.display();
		//Student s3  = new Student();
		//s3.display();
		//s1.display();
		
	    System.out.println("Students Details:");
		//getdata(333,"Pragati",90);
		//s1.display();

	}

	
}

