package InternPack;

public class Engine {
	double HP;
	double cost;
	public void combustion() {
		System.out.println("The engine is in good condition");
	}
	public void display() {
		System.out.println("HP of engine :"+ HP);
		System.out.println("cost of engine"+ cost);
	}
	public Engine(double HP, double cost) {
		
		this.HP = HP;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Engine [HP=" + HP + ", cost=" + cost + "]";
	}
}
