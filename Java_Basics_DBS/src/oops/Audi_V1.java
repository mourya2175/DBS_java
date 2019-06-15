package oops;

public class Audi_V1 extends Audi_Car{
	
	public void gears()
	{
		System.out.println("5 gear mdoel");
	}

	public static void main(String[] args) {
		Audi_V1 av = new Audi_V1();
		av.gears();
		av.wheels();
		av.color();
		
	}

}
