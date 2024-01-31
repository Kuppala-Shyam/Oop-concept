package InternPack;

public class Home {
	private class BlueStar implements Ac{
		public void cooling() {
			System.out.println("It's to cool in the room");
		}
		public void airCirculation() {
			System.out.println("The air circulation of ac is good in condition");
		}
	}
	public Ac ac() {
		return new BlueStar();
	}
	
}
