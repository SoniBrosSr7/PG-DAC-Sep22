public class InstanceMethod3{


	
	public static void main(String args[]){
		
	InstanceMethod3 i1 = new InstanceMethod3();
	 
	 //Method call : calling of a function
	 String s1 = i1.sayHello("Good morning");//Good morning
	 System.out.println(s1);
	 System.out.println(i1.sayHello("Good morning"));
	}
	
	String sayHello(String s)
	{
		String str;
		str = s+" CDAC ";
		return str;
		
	}
	
}

