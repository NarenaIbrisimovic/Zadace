package Homework14;
/*
 * Napisati jednu metodu koja prima jednu matricu i jedan broj.Odrediti koliko se puta ponavlja dati broj.
 */

public class Task1 {
	/**
	 * Counts how many times is reapited number in matrix.
	 * 
	 */

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 1 }, { 5, 2, 1}, { -4, 2, 3 } };
		System.out.println(countNumber(matrix, 1));
		
	}

	public static int countNumber(int[][] matrix, int number) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
			
				if (matrix[i][j] == number) {
					counter++;
				}

			}

		}
		return counter;
	}

}
