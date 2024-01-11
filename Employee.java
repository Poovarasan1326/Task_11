package Task_10;

public class Employee {

	// Attributes
	private int ID;
	private String name;
	private double salary;

	// Constructor
	public Employee(int ID, String name, double salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}

	// Getter method for ID
	public int getID() {
		return ID;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Getter method for salary
	public double getSalary() {
		return salary;
	}

	// Method to raise salary by a specified percentage
	public void raiseSalary(double percent) {
		if (percent > 0) {
			double increaseAmount = salary * (percent / 100);
			salary += increaseAmount;
			System.out.println("Salary raised by " + percent + "%. New salary: " + salary);
		} else {
			System.out.println("Invalid percentage. Salary remains unchanged.");
		}
	}

	public static void main(String[] args) {
		// Creating an instance of the Employee class
		Employee employee = new Employee(101, "Jack", 80000.0);

		// Accessing attributes using getter methods
		System.out.println("ID: " + employee.getID());
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());

		// Raising the salary by 10%
		employee.raiseSalary(10);
	}
}
