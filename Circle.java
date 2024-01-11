package Task_10;

public class Circle {

	// Data member
	private double radius;

	// No-argument constructor
	public Circle() {
		this.radius = 0.0; // Default radius is set to 0.0
	}

	// Two-argument constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Method to calculate circumference
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		// Creating an instance of the Circle class using the no-argument constructor
		Circle circle1 = new Circle();
		System.out.println("Circumference of circle1: " + circle1.calculateCircumference());

		// Creating an instance of the Circle class using the two-argument constructor
		Circle circle2 = new Circle(5.0); // Setting radius to 5.0
		System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
	}
}
