public class Task7 {

	public static void main(String[] args) {
		int var = 1815;
		
		int thousand = var / 1000;
		int hundred = (var/ 100) % 10;
		int ten = (var / 10) % 10;
		int num = var % 10; 
		
		System.out.println(thousand + hundred + ten + num );
	
	}

}