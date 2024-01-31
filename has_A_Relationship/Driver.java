package InternPack;

public class Driver {

	public static void main(String[] args) {
		Car car = new Car("2023","black",new Engine(200.0,50000.0));
		System.out.println(car);
		car.e.display();

	}

}
