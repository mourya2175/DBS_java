package basics;

public class Variable_example {
	//declare a variable wit static Keyword then it is class or static variable
	static int y=20;
	//instance variable -- which is declared inside class and outside of methods
	int i=15;
	public void m1()
	{
		int x=15;//local variable --declared inside method
		System.out.println("Local variable value is : "+x);
		System.out.println("Instance variable value in M1 :"+i);
		System.out.println("Static variable value in M1 : "+y);
	}
	public void m2()
	{
		//local variables can not be used outside method
//		System.out.println("M1 Local variable value is : "+x);
		//instance variable can be used in methods
		System.out.println("Instance variable value in M2 :"+i);
		System.out.println("Static variable value in M2 : "+y);
	}
	public static void main(String[] args) {
		Variable_example ve = new Variable_example();
		ve.m1();
		//Static variable can be used in mainmethod 
		System.out.println("Static variable value is : "+y);
	}
}
