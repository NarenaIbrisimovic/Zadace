package Homework9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean fileNameOk;
		
		do{
			fileNameOk = true;
		try{
		String fileName = in.next();
		TextIO.readFile("src/Homework9/" + fileName);
		}catch (IllegalArgumentException e){
			System.out.println("Wrong file name. Try again");
			fileNameOk = false;
		}
		}while (fileNameOk == false);
		
		String str = TextIO.getln();
		int number = Integer.parseInt(str);
		long factoriel = 1;
		
		for(int i = 1; i <= number; i++){
			factoriel *=i;
		}
		System.out.println(factoriel);
		
		}
		

		
	}


