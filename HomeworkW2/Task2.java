package HomeworkW2;

import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String bracket = in.nextLine();
                int length = bracket.length();

                int open = 0; // open brackets
                int close = 0; // closed brackets
                
                boolean mistake = false;

                for (int i = 0; i <= length-1; i++) {
                       
                        if (bracket.charAt(i) == '{') {
                                open++;
                        } else if(bracket.charAt(i) =='}') {
                                close++;
                        }
                        if (close > open) {
                        	mistake = true;
                        }
                }
                if (mistake==true){
                	System.out.println("Zatvorenih zagrada je vise nego otvorenih.");
                }

                else  if (close != open) {
                    System.out.println("Više otvorenih nego zatvorenih zagrada.");
               }
                else {
                	System.out.println("Nema greske");
                }
        }

}