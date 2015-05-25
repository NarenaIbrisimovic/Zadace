package zadaca4;

public class Trougao {
	public static void main(String[] args) {
		double sideA = 3;
		double sideB = 6;
		double sideC = 10;
		
		if (sideA > sideB && sideA > sideC){
			if (sideA < sideB + sideC){
				System.out.println("To je trougao");
			}else {
				System.out.println ("Nije trougao1");
			}
		}else if (sideB > sideA && sideB > sideC){
				if (sideB < sideA + sideC){
				System.out.println("To je trougao");
			}else {
				System.out.println ("Nije trougao2");
			}
		} else if (sideC < sideA + sideB){
			System.out.println("To je trougao c");
		}else {
			System.out.println ("Nije trougao3");
		}
		
	}
}



