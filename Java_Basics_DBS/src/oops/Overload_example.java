package oops;

public class Overload_example {
	
	public void add()
	{
		System.out.println("addition is : "+(8+9));
	}

	public void add(int i, int j)
	{
		System.out.println("addition is : "+(i+j));
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println("addition is : "+(i+j+k));
	}
	
	public void add(int i)
	{
		System.out.println("addition is : "+(i+9));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
