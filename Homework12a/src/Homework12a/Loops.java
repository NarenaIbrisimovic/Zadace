package Homework12a;

/*
 * Napisati metodu koja ispisuje (ne vraca N), ali sa zarezom nakon svake tri cifre.
 * 
 * Napisati metodu koja odreduje koliko cifara ima N i isprintati na konzoli.
 *  
 * Napisati metodu koja vraca broj Q, koji predstavlja borj N kada se zadnja i prva cifra promijene.
 * 
 * Napisati metodu koja odredi koliko ima brojeva izmedu N i Q.Ukoliko se nalazi neparan broj izmedu brojeva N i Q onda isprintati sve neparne,
 * u suprotnom isprintati sve parne brojeve.
 */

import java.util.Scanner;

public class Loops {

	public static void getNumber() {
		String c;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		char b;
		String d = "";
		int var = 1;

		c = Integer.toString(a);

		for (int i = c.length() - 1; i >= 0; i--) {

			b = c.charAt(i);
			d = b + d;

			if (var % 3 == 0 && i != 0) {
				d = "," + d;

			}
			var++;

		}
		System.out.print(d);

	}

	
	
	public static void BrojCifara() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String b;
		b = Integer.toString(a);
		System.out.println(b.length());
	}

	
	
	public static String ChangeNumber(int N) {
		String a;
		a = Integer.toString(N);
		return (a.substring(a.length() - 1) + a.substring(1, a.length() - 1) + a
				.substring(0, 1));

	}

	
	public static void countDigitBeetwenTwoNumbers() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		int numberBetweenNandQ = Q - N - 1;

		if (numberBetweenNandQ % 2 == 0) { // even
			System.out.print("Even number are: ");
			for (int i = N + 1; i < Q; i++) {
				if (i % 2 == 0) {
					System.out.print(i + ", ");
				}
			}
		} else {
			System.out.print("Odd numbers are: ");
			for (int i = N + 1; i < Q; i++) {
				if (i % 2 != 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}
	public static void main(String[] args) {
		getNumber();
		BrojCifara();
		System.out.println(ChangeNumber(12345678));
		countDigitBeetwenTwoNumbers();

	}

}
