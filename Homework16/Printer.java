package vjezbe;
/*
 * Napisati klasu koja opisuje jedan printer. Printer ima sljedeće atribute: ime printera, kolicina papira u prinetru,
 * kolicina tinte u printeru,ukupno isprintanih stranica.
 * Printer ime sljedece konstruktore: prazni konstruktor koji inicijalizira ime na „DefaultPrinter“, a količinu papira i tinte na 0
 * Konstruktor koji inicijalizira ime na dati parametar, a količinu papira i tinte na 0.
 * Oba konstruktora inicijaliziraju ukupno isprintano stranica na 0.Printer ima sljedeće metode:
 * Metoda koja vraća da li ima tinte (true/false).Metoda koja vraća da li ima papira (true/false).Metoda koja vraća koliko je ukupno isprintano stranica od tog printera
 * Metoda koja dodaje papira u printer (void metoda).Uzeti u obzir da se ne može imati više od 100 papira u printeru.
 * Metoda koja napuni tintu na max. (void metoda).Maksimalno tinte je 100.Metoda koja „printa“ stranice papira (void metoda).Metoda prima int parametar koji predstavlja koliko stranica isprintati.
 * Za svaku isprintanu stranicu oduzeti jedan papir iz printera. Za svaku isprintanu stranicu oduzeti tri iz atributa tinta.Ukoliko nema papira ili ako nema tinte onda ne treba printati.
 * Pored toga Printer klasa sadrži sljedeće: toString metodu koja printa ime printera i trenutno stanje. tanje može biti „Ready“, „No ink“, „No paper“, „No ink nor paper“.
 * static varijablu koja bilježi koliko ukupno stranica je isprintano.Napisati i metodu koja vraća vrijednost te varijable.
 */
public class Printer {

	private String name;
	private int quantityOfPaper;
	private int quantityOfInk;
	private int sumPrintPage;
	private static int totalPrintedPages = 0;
	

	public Printer() {
		this.name = "Default Printer";
		this.quantityOfPaper = 0;
		this.quantityOfInk = 0;
	}

	public Printer(String name) {
		this.name = name;
		this.quantityOfPaper = 0;
		this.quantityOfInk = 0;
	}

	/**
	 * Return has ink in printer
	 * 
	 * @param quantityOfInk
	 * @return - true/false
	 */

	public boolean hasInk(int quantityOfInk) {
		if (quantityOfInk == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Return has paper in printer
	 * 
	 * @param quantityOfPaper
	 * @return true/false
	 */
	public boolean hasPaper(int quantityOfPaper) {
		if (quantityOfPaper == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 
	 * @return sum print pages
	 */
	public int getprintPaper() {
		return sumPrintPage;
	}

	/**
	 * Add paper in printer.
	 * 
	 * @param quantityOfPaper1
	 *            - quantity of paper.
	 */
	public void addPaper(int quantityOfPaper1) {
		if (quantityOfPaper <= 100) {
			quantityOfPaper += quantityOfPaper1;
		}

	}

	/**
	 * Add ink in printer
	 * 
	 * @param quantityOfInk1
	 *            - quantity of ink.
	 */
	public void addInk(int quantityOfInk1) {
		if (quantityOfInk <= 100) {
			quantityOfInk += quantityOfInk1;
		}
	}

	/**
	 * 
	 * @param quantityPrintPaper
	 */
	public void printPaper(int quantityPrintPaper) {

		for (int i = 0; i < quantityPrintPaper; i++) {
			quantityOfPaper--;
			quantityOfInk = quantityOfInk - 3;
			sumPrintPage++;
			totalPrintedPages++;
			if (quantityOfPaper <= 0) {
				System.out.println("Put paper in printer");
			} else if (quantityOfInk <= 0) {
				System.out.println("Put ink in printer");
				break;
			}

		}

	}

	/**
	 * Print name of printer and condition of printer.
	 */
	public String toString() {
		String s = "";

		if (quantityOfInk <= 0) {
			s = "Name:" + name + "No ink";
		} else if (quantityOfPaper <= 0) {
			s = "Name:" + name + "No paper";
		} else if (quantityOfInk <= 0 && quantityOfPaper <= 0) {
			s = "Name:" + name + "No paper, no ink";
		} else {
			s = "Redy";
		}
		return s;

	}
	
	/**
	 * 
	 * @return total printed pages
	 */
	public static int getToatlPrintedPages(){
		return totalPrintedPages;
		
	}
	

}
