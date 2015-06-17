package vjezbe;

public class MainPrinter {

	public static void main(String[] args) {
		Printer p = new Printer ("Canon");
		System.out.println("Quantity of ink in printer:" +  p.hasInk(10));
		System.out.println("Quantity of paper in printer:" +  p.hasPaper(20));
		p.addPaper(100);
		p.addInk(30);
		p.printPaper(20);
		System.out.println(p.getprintPaper());
	}

}
