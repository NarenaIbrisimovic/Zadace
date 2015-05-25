package zadaca4;

public class Horoskop {

	public static void main(String[] args) {
		int day = 8;
		int month = 5;
		
		if (day >= 21 && month == 3 || day <= 20 && month == 4){
			System.out.println("Aries");
		}else if (day >= 21 && month == 4 || day <= 21 && month == 5){
			System.out.println("Taurus");
		}else if (day >= 22 && month == 5 || day <= 21 && month == 6){
			System.out.println ("Gemini");
		}else if (day >= 22 && month == 6 || day <= 22 && month == 7){
			System.out.println("Cancer");
		}else if (day >=23 && month == 7 || day <= 23 && month == 8){
			System.out.println("Leo");
		}else if (day >= 24 && month == 8 || day <= 23 && month == 9){
			System.out.println ("Virgo");
		}else if (day >= 24 && month == 9 || day <= 23 && month == 10){
			System.out.println ("Libra");
		}else if (day >= 24 && month == 10 || day <= 22 && month == 11){
			System.out.println ("Scorpio");
		}else if (day >= 23 && month == 11 || day <= 21 && month == 12){
			System.out.println("Sagittarius");
		}else if (day >= 22 && month == 12 || day <= 20 && month == 1){
			System.out.println ("Capricorn");
		}else if (day >= 21 && month == 1 || day <= 19 && month == 2){
			System.out.println("Aquarius");	
		}else if (day >= 20 && month == 2 || day <= 20 && month == 3){
			System.out.println("Pisces");
		}

	}

}
