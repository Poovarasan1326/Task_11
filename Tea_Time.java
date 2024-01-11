package Task_10;

public class Tea_Time {
	public void prepareTea() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addCondiments();
	}

	private void boilWater() {
		System.out.println("Boiling water");
	}

	private void steepTeaBag() {
		System.out.println("Steeping the tea bag");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	protected void addCondiments() {
		// This method will be overridden by subclasses
	}
}

// BlackTea subclass
class BlackTea extends Tea_Time {
	@Override
	protected void addCondiments() {
		System.out.println("Adding lemon to black tea");
	}
}

// GreenTea subclass
class GreenTea extends Tea_Time {
	@Override
	protected void addCondiments() {
		System.out.println("Adding honey to green tea");
	}
}

// HerbalTea subclass
class HerbalTea extends Tea_Time {
	@Override
	protected void addCondiments() {
		System.out.println("Adding mint leaves to herbal tea");
	}

// Main class to test the tea classes

	public static void main(String[] args) {
		System.out.println("Preparing Black Tea:");
		BlackTea blackTea = new BlackTea();
		blackTea.prepareTea();

		System.out.println("\nPreparing Green Tea:");
		GreenTea greenTea = new GreenTea();
		greenTea.prepareTea();

		System.out.println("\nPreparing Herbal Tea:");
		HerbalTea herbalTea = new HerbalTea();
		herbalTea.prepareTea();

	}
}
