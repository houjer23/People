import java.util.ArrayList;
public class Tester {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		Person p1 = new Person("James", 13);
		Person p2 = new Person("Jerry", 16);
		Instructor i1 = new Instructor("Jack", 23, 10000);
		Instructor i2 = new Instructor("Thomas", 30, 20000);
		Scholar s1 = new Scholar("Jason", 17, "Computer Science");
		Scholar s2 = new Scholar("Jacky", 18, "Business");		
		people.add(p1);
		people.add(p2);
		people.add(i1);
		people.add(i2);
		people.add(s1);
		people.add(s2);
		System.out.println();
		for (int i = 0; i < people.size(); i ++) {
			System.out.println(people.get(i));
		}
	}
}
