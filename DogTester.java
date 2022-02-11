import java.util.ArrayList;


public class DogTester {
public static void main(String[] args) {
Dog d1 = new Dog("Pal", 2018, "unspecified");
 Dog d2 = new Dog("John", 2008, "unspecified");
Doodle l1 = new Doodle("Rocket", 2019, "Doodle", "doesn't shed");
 Doodle l2 = new Doodle("Beax", 2016, "Doodle", "doesn't shed");
ShihTzu s1 = new ShihTzu("Hannibal", 2015, "ShihTzu", 8);
 ShihTzu s2 = new ShihTzu("Coconut", 2013, "ShihTzu", 16);
GreyHound g1 = new GreyHound("Zoey", 2020, "Grey Hound", 43);
 GreyHound g2 = new GreyHound("Joe", 2019, "Grey Hound", 48);
 ArrayList<Dog> dogsList = new ArrayList<>();
 dogsList.add(d1);
 dogsList.add(d2);
 dogsList.add(l1);
 dogsList.add(l2);
 dogsList.add(s1);
  dogsList.add(s2);
  dogsList.add(g1);
  dogsList.add(g2);
 System.out.println(dogsList);
}

}
