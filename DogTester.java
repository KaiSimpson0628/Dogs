import java.util.ArrayList;


public class DogTester {
public static void main(String[] args) {
Dog d1 = new Dog("Pal", 2018, "unspecified");
Doodle l1 = new Doodle("Rocket", 2019, "Doodle", "doesn't shed");
ShihTzu s1 = new ShihTzu("Hannibal", 2015, "ShihTzu", 8);

 ArrayList<Dog> dogsList = new ArrayList<>();
 dogsList.add(d1);
 dogsList.add(l1);
 dogsList.add(s1);
 System.out.println(dogsList);
}

}