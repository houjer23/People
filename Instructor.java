public class Instructor extends Person {
	private double salary;
	
	public Instructor(String name, int birth, double salary) {
		super(name, birth);
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + " Salary: " + salary;
	}
}
