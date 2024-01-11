package Task_10;

public class Tea {

	private boolean isHotWaterAdded;
	private boolean isTeaLeavesAdded;

	// Constructor
	public Tea() {
		this.isHotWaterAdded = false;
		this.isTeaLeavesAdded = false;
	}

	// Method to prepare basic tea with hot water and tea leaves
	public void prepareTea() {
		isHotWaterAdded = true;
		isTeaLeavesAdded = true;
		System.out.println("Basic tea is prepared with hot water and tea leaves.");
	}

	// Method to add milk to the tea
	public void addMilk() {
		if (isHotWaterAdded && isTeaLeavesAdded) {
			System.out.println("Milk is added to the tea.");
		} else {
			System.out.println("Cannot add milk without hot water and tea leaves.");
		}
	}

	// Method to add sugar to the tea
	public void addSugar() {
		if (isHotWaterAdded && isTeaLeavesAdded) {
			System.out.println("Sugar is added to the tea.");
		} else {
			System.out.println("Cannot add sugar without hot water and tea leaves.");
		}
	}

	public static void main(String[] args) {
		// Creating an instance of the Tea class
		Tea myTea = new Tea();

		// Preparing basic tea
		myTea.prepareTea();

		// Adding milk to the tea
		myTea.addMilk();

		// Adding sugar to the tea
		myTea.addSugar();
	}
}
