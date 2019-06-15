package oops;

public class Axis_Bank implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis_Bank a = new Axis_Bank();
		a.deposit();
		a.withDraw();

	}

	@Override
	public void withDraw() {
		System.out.println("Limit is 30K per day");		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit Limit is 130K per day");	

	}

}
