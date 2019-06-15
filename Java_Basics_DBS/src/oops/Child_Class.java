package oops;

public class Child_Class extends Parent_Class{

	public void m1()
	{
		System.out.println("This is method in child class");
	}
	public static void main(String[] args) {

		Child_Class cc = new Child_Class();
		cc.m1();
	}

}
