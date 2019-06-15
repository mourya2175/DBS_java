package exceptions;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		try {
			int i=0;
			System.out.println("Division is : "+(15/i));
			System.out.println("this is my program");

		} catch (Exception e) {
			System.out.println("There is an error in input");
		}		

	}

}
