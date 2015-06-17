package vjezbe;

public class MainGlass {

	public static void main(String[] args) {
		Glass g = new Glass("Voda", 10, 20);
		System.out.println("Current capacity:" + g.getCurrentCapacity());
		System.out.println("Current max capasity:" + g.getMaxCapacity());

	}

}
