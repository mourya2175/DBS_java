package exceptions;

public class Nullpointer_Example {

	public static void main(String[] args) {
		try {
			System.out.println("Start service");
			String s="Java";
			System.out.println("Lenght is : "+s.length());

		} catch (Exception e) {
			System.out.println("Please give a valid string");
			e.printStackTrace();
		}
		finally {
			System.out.println("Stop service");
		}
	}

}
