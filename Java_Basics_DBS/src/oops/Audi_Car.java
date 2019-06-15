package oops;

public class Audi_Car extends Car{
	
	public void color()
	{
		System.out.println("Black color car");
	}

	public static void main(String[] args) {

		Audi_Car ac = new Audi_Car();
		ac.color();
		ac.wheels();
		ac.fuel();
	}

}
