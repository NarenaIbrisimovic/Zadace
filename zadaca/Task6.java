
public class Task6 {

	public static void main(String[] args) {
		int hour = 18;
		int minute = 45;
		
		if (hour <=12) { 
			System.out.println( hour + ":" + minute + "h AM");	
		} else if (hour == 24) {
			System.out.println("00:" + minute + "h AM" );		
		} else {
			System.out.println( hour + ":" + minute + "h PM");			
		}
	}

}