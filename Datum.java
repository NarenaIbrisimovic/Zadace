package zadaca4;

public class Datum {

	public static void main(String[] args) {
		int date1 = 29;
		int month1 = 5;
		int year1 = 2011;
		int date2 = 8;
		int month2 = 5;
		int year2 = 1981;
		
		if (year2 > year1){
			System.out.println("date2 is before date1");
		}else if (year2 < year1){
			System.out.println("date1 is before date2");
		}else {
			if (month1 < month2){
				System.out.println("date2 is before date1");
			}else if (month1 > month2){
					System.out.println("date1 is before date2");
				}else {
					if (date1 < date2){
						System.out.println("date2 is before date1");
					}else if (date1 > date2){
						System.out.println("date1 is before date2");
					}else {
						System.out.println("Wrong date");
					}
				}
			}
			
			
		}
}

