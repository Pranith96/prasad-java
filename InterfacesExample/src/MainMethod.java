
public class MainMethod {

	public static void main(String[] args) {
		MotorBikeImpl bike = new MotorBikeImpl();
		bike.engine();
		bike.mirror();
		bike.tire();
		
		System.out.println("...................");
		MotorBikeImpl1 bike1 = new MotorBikeImpl1();
		bike1.engine();
		bike1.tire();
		bike1.mirror();
		
		Bike bikeResponse = new MotorBikeImpl();
		bikeResponse.mirror();
		bikeResponse.tire();
		bikeResponse.engine();
	}
}
