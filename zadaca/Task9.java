package zadaca4;

public class Task9 {

	public static void main(String[] args) {
		

				int a = 101; 
		 
		        int hunderds = a / 100;
		        int remainder = a % 100;
		        int tens= remainder / 10 ;
		        int remainder1 = remainder %10;
		        int units = remainder1 / 1 ;
		        int sum = hunderds + tens + units;
		        System.out.println( sum);
		        
		        if (a % sum == 0){
		         System.out.println("Numbers are devided!");
		        }else{
		         System.out.println("Numbers are not devided!");
		        }
		         
		 }
}


