public class Tester {
	public static void main(String[] args) {
		System.out.println();
		Person p = new Person("James", 13);
		System.out.println(p);
		Instructor i = new Instructor("Jack", 15, 100);
		System.out.println(i);
		Scholar s = new Scholar("Jason", 17, "Computer Science");
		System.out.println(s);
	}
}
