package basics;

public class No_Args_Constructor {
	
	public No_Args_Constructor()
	{
		System.out.println("this is no args constrcutor");
	}
	
	public void m1()
	{
		System.out.println("method 1");
	}

	public static void main(String[] args) {

		No_Args_Constructor nac = new No_Args_Constructor();
	}

}
