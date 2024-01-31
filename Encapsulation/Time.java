package InternPack;

public class Time {

	public static void main(String[] args) {
		Clock clock = new Clock(6,34,58);
		clock.showTime();
		clock.setHr(8);
		clock.setMin(14);
		clock.setSec(24);
		System.out.println(clock.getHr());
		System.out.println(clock.getMin());
		System.out.println(clock.getSec());
		System.out.println(clock);

	}

}
