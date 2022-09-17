public class InstanceMethod4{

	String sayHello(String s)
	{
		String str;
		str = s+" CDAC ";
		return str;
		
	}
	
	int addition(int x, int y)
	{
		int sum = x+y;
		return sum;
	}
	
	
	public static void main(String args[]){
		
	InstanceMethod4 i1 = new InstanceMethod4();
	InstanceMethod4 i2 = new InstanceMethod4();
	 
	 //Method call : calling of a function
	 String s1 = i1.sayHello("Good morning");//Good morning
	 System.out.println(s1);
	 
	 //or
	 
	 System.out.println(i1.sayHello("Good morning"));
	 
	 int s = i2.addition(10,20);//call by value.
	 System.out.println("Addition= "+s);
	 System.out.println(i2.addition(10,20));
	}
	
	
}

