package InternPack;

public class Car {
	String modalOfCar;
	String Color;
	Engine e;
	public Car(String modalOfCar, String color, Engine e) {
		super();
		this.modalOfCar = modalOfCar;
		Color = color;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Car [modalOfCar=" + modalOfCar + ", Color=" + Color + ", e=" + e + "]";
	}
	
}
