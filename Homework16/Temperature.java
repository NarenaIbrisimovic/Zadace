package vjezbe;
/*
 * Napisati klasu koja opisuje temperaturu napolju. Temperatura je spremljena u jedan atribut, u °C.
 * Napisati konstruktor koji inicijalizira vrijednost temperature.
 * Napisati metodu getTemperatureInC() koja vraća temperaturu u Celzijusima.
 * Napisati metodu getTemperatureInK() koja vraća temperaturu u Kelvinima.
 * Napisati metodu getTemperatureInF() koja vraća temperaturu u Farenhajtim.
 * Napisati metodu setTemperature(int) koja postavlja vrijednost temperature.
 * Napisati javadoc za sve metode.
 */

public class Temperature {

	double temp;
	 
	
	public Temperature (double temp){
		this.temp = temp;
	}
	
	/**
	 * 
	 * @return temperature in Cesius
	 */
	public double getTemperatureInC(){
		return temp;
		
	}
	
	/**
	 * Convert Celsius to Kelvin
	 * @return temperature in Kelvin
	 */
	public double getTemperatureInK(){
		return temp + 273.15;
	
	}
	
	/**
	 * Convert Celsius to Farenhajt
	 * @return temperature in Farenhajt.
	 */
	public double getTemperatureInF(){
		return temp * 1.8 +32;
		
	}
	
	/**
	 *
	 * @param temp - set temeperature
	 */
	public void setTemperature(int temp){
		this.temp = temp;
		
	}
	

}
