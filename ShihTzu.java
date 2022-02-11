public class ShihTzu extends Dog {
	private int fetchRats;
	
	public ShihTzu(String name, int birth, String breed, int fetchRats) { 
		super (name, birth, breed);
		this.fetchRats = fetchRats;
	}
	public String toString() 
	{
		return (super.toString() + " and has fetched " + fetchRats + " rats ");
	}
}
