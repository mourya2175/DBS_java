package basics;

public class Method_Example {
	
	public void addition()
	{
		System.out.println("Addition of two numbers : "+(9+7));
	}

	public static void main(String[] args) {
		
		//create an object for class
		//1. variable name 2. new keyword 3.Constructor --classname with ();
		Method_Example me = new Method_Example();
		me.addition();
		me.subtraction();
		

	}
	
	public void subtraction()
	{
		System.out.println("sub of two numbers : "+(9-7));
	}

}
