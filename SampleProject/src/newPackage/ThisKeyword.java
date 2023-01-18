package newPackage;

public class ThisKeyword {
	
	public void fruit()
	{
		System.out.println("i'm in fruit method");
	}
	
	public void vegetables()
	{
		this.fruit();
		System.out.println("i'm in vegetables");
	}

	public static void main (String [ ] args)
	{
		ThisKeyword t = new ThisKeyword();
		t.vegetables();
		System.out.println("fruit");
	}
}
