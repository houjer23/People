public class Person {
	private String name;
	private int birth;

	public Person(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public String toString() {
		return "Name: " + name + ",    Year of Birth: " + birth;
	}
}
