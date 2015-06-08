
public class Task5 {
	
	public static String getNumbersOnly(String s){
		char a;
		String b;
		String c = "";
		
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			for (int j = 0; j <= 9; j++) {
				b = Integer.toString(j);
				if (a == b.charAt(0)) {
					c = c + a;	
				}
			}
		}
		
		return c;
	}

	public static void main(String[] args) {
		System.out.println(getNumbersOnly("uk234nmj68mkoksbdghcvwygiec09182"));
		

	}

}
