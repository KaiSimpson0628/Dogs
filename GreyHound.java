public class GreyHound extends Dog {
	private int runSpeed;
	
	public GreyHound(String name, int birth, String breed, int runSpeed) { 
		super (name, birth, breed);
		this.runSpeed = runSpeed;
	}
	public String toString() 
	{
		return (super.toString() + " and runs  " + runSpeed + " MPH ");
	}
}
