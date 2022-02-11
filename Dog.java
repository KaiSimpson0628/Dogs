

public class Dog {

	private String name;
	private int yearofBirth;
	private String breed;
	
	
public Dog(String name, int birth, String breed) {
		this.name = name; //this refrence is only for when the variables are the same name
		yearofBirth = birth;
		this.breed = breed;
		}
		
public String toString() {
	return("\n" + name + " was born in " + yearofBirth + " and is a " + breed);
}
}
