package Homework14;
/*
 * Napisati jednu metodu koja prima jednu matricu i odreduje koliko ukupno redova i kolona ima zbir jednak nulu.
 */

public class Task2 {
	/**
	 * Counts the number rows and columns that have sum = 0.
	 * @ sum is counter rows and columns.
	 */

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };
		System.out.println(getNumOfZeroRowsAndColumns(matrix1));

	}

	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];

			}
			if (sum == 0) {
				counter++;

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];

			}
			if (sum == 0) {
				counter++;

			}
		}
		return counter;

	}

}
