package Task_10;

public class Person {

	// Attributes
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Getter method for age
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// Creating an instance of the Person class
		Person person = new Person("John Doe", 25);

		// Accessing attributes using getter methods
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}

}
