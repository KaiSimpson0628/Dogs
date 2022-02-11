public class Doodle extends Dog {
private String shed;

public Doodle (String name, int birth, String breed, String shed)
	{
	super (name, birth, breed);
	this.shed = shed;
	}
	public String toString()
	{
		return (super.toString() + " which " + shed);
	}
}
