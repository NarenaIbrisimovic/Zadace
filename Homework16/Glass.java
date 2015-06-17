package vjezbe;
/*
 * Napisati klasu koja opisuje čašu. Čaša prima samo jednu vrstu tečnosti. Dati objekat opisuju tri atributa, vrsta tečnosti, količinu tečnosti i maksimalnu količinu tečnosti.
 * Napisati konstruktor koji inicijalizira količinu na 0, vrstu na null i max. količinu na datu vrijednost.
 * Napisati metodu getTypeOfLiquid() koja vraća tip tečnosti koji se nalazi u čaši.
 * Napisati metodu getMaxCapacity() koja vraća maksimalni kapacitet čaše.
 * Napisati metodu getCurrentCapacity() koja vraća trenutni kapacitet čaše.
 * Napisati metodu addLiquid(String, int) koja dodaje neku količinu nekog tipa tečnosti u čašu
 * Ukoliko čaša sadrži tečnost koja nije kao data onda ništa ne raditi.
 * Ukoliko čaša sadrži tečnost koja je i data onda povećati za datu količinu
 * Svaki višak tečnosti se „prelije“ i trenutni kapacitet bude isti kao i maksimalni.
 * Napisati metodu emptyGlass() koja „prospe“ svu tečnost iz čaše.
 * Napisati javadoc za sve metode.
 * 
 */

public class Glass {

	private String typeOfLiquids;
	private int quantity;
	private int maxQuantity;

	public Glass(String typeOfLiquids, int quantity, int maxQuantity) {
		this.typeOfLiquids = typeOfLiquids;
		this.quantity = quantity;
		this.maxQuantity = maxQuantity;
	}

	
	/**
	 * Set type of liquids.
	 * @param typeOfLiquids 
	 */
	public void setTypeOfLiquid(String typeOfLiquids) {
		this.typeOfLiquids = typeOfLiquids;
	}

	/**
	 * 
	 * @return type of liquides.
	 */
	public String getTypeOfLiquid() {
		return typeOfLiquids;
	}

	
	/**
	 * 
	 * @return max capacity of glass.
	 */
	public int getMaxCapacity() {
		return maxQuantity;
	}

	
	/**
	 * 
	 * @return current capacity of glass.
	 */
	public int getCurrentCapacity() {
		return maxQuantity - quantity;
	}

	/**
	 * 
	 * @param s type of liquids
	 * @param quantity1 - quantity of liquides.
	 */
	public void addLiquid(String s, int quantity1) {
		if (s.equals(typeOfLiquids)) {
			quantity += quantity1;
			if (quantity > maxQuantity) {
				quantity1 = quantity;
			}
		}

	}
	
	private void emptyGlass() {
		typeOfLiquids = null;
		quantity = 0;
	}
}
