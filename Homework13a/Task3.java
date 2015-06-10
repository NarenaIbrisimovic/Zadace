package Homework13;

public class Task3 {

	public static void main(String[] args) {
		System.out.println(getCountOfNumbers("Pparam546"));
		
	}
	
	public static int getCountOfNumbers(String s) {
		boolean number = false;
		char a;
		String b;
		int counter = 0;
		

		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			for (int j = 0; j <= 9; j++) {
				b = Integer.toString(j);	
				if (a == b.charAt(0)) {
					counter++;
				
					}
			
				
				
			
					}
			
			
					number = true;
							
				}
		
		
		return  counter ;
	}
}

