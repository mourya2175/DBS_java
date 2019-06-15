package basics;

public class Parameter_Constructor {


	public  Parameter_Constructor(String name)
	{
		System.out.println("My Name is :"+name);
	}
	public void calc()
	{
		System.out.println("used for calculations");
	}
	public static void main(String[] args) {

		Parameter_Constructor pc = new Parameter_Constructor("java and Selenium");
		pc.calc();
	}

}
