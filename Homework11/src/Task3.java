public class Task3 {
	public static boolean hesNumbers(String s) {
		boolean number = false;
		char a;
		String b;

		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			for (int j = 0; j <= 9; j++) {
				b = Integer.toString(j);
				if (a == b.charAt(0)) {
					number = true;
				}
			}
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(hesNumbers("Pparam"));

	}

}
