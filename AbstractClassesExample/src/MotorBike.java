
public abstract class MotorBike extends Bike {
	
	public void tire() {
		System.out.println("tire");
	}

	public abstract void breaks();

	public abstract void seat();

	public void petrol() {
		System.out.println("Petrol");
	}
}
