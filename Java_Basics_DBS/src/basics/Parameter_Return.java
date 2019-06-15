package basics;

public class Parameter_Return {
	
	public void add(int i, int j)
	{
		System.out.println("Addition is : "+(i+j));
	}

	public static void main(String[] args) {

		Parameter_Return pr = new Parameter_Return();
		pr.add(5, 9);
		pr.add(15, 345);
		int k=pr.sub(16, 5);
		pr.add(k, 10);
	}

	public int sub(int x, int y)
	{
		return (x-y);
	}
}
