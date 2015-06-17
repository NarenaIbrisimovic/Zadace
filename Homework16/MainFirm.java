package Homework16;

public class MainFirm {

	public static void main(String[] args) {
	
	Employee e1 = new Employee ("e1","female", 20);
	Employee e2 = new Employee ("e2","female", 40);

	Firm f = new Firm ("f",e1, new Employee[]{e1, e2});
	
	System.out.println(f.getNumberOfEmployees());

	


	}

}
