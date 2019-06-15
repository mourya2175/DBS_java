package basics;

public class ElseIf_Example {

	public static void main(String[] args) {
		int marks=55;

		if (marks>75) {
			System.out.println("Distinction");

		} 
		else if (marks>60 && marks<75) {
			System.out.println("First class");
		}

		else if (marks>45 && marks<60) {
			System.out.println("Passed");

		}

		else {
			System.out.println("failed");

		}
	}

}
