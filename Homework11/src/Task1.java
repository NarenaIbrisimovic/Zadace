
public class Task1 {
	
	public static int getMin2 (int num1, int num2){
		
		
		if (num1 < num2){
			return num1;	
		}else{
			return num2;
		}
	}
	
	public static int getMin3 (int num1, int num2, int num3){
		
		if (num1 < num2 && num1 < num3){
			return num1;
		} else if (num2 < num3){
			return num2;
		}else {
			return num3;
		}
	}

	public static void main(String[] args) {
		System.out.println( getMin2 (4,3));
		System.out.println ("Najmanji broj je:" + getMin3(4,3,22));

	}

}
