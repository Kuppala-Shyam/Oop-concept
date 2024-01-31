package InternPack;

public class Tomato extends Vegetables{
	String quality;
	public Tomato(String color,double price,double weight, String quality) {
		super(color,price,weight);
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Tomato [quality=" + quality + ", color=" + color + ", price=" + price + ", weight=" + weight + "]";
	}
	
}
