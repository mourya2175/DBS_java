package basics;

public class Array_Example {

	public static void main(String[] args) {

		String names[]= {"java",".net","perl","python"};
		
		System.out.println("number of vlaue in array : "+names.length);
		
		System.out.println("third language : "+names[2]);
		
		//print all values
		for (int i = 0; i < names.length; i++) {
			System.out.println("Values are : "+names[i]);
			
		}
		
		for (String values : names) {
			System.out.println("values in array are using foreach : "+values);
		}
	}

}
