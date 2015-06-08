package Homework12a;
import java.util.Scanner;
public class Task5 {
	/*
	 * Unijeti jedan cijeli broj N preko Scanner-a. Broj N predstavlja koliko je sati.Odrediti da li je tada predavanje, vjezbe, zadaca ili spavanje.
	 */
	
	public static String getTime(int time){
		String hour = " ";
		
		switch (time){
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			hour = "Sleeping";
			break;
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			hour =  "Lectures";
		break;
		case 14:
		case 15:
		case 16:
		case 17:
			hour ="Exercises!";
			break;
		 default:
			 hour = "Homeworks";	
		}
		return hour;
	}
	public static void main(String[] args) {
		
		
		System.out.println(getTime(2));
		
		
	}
}
