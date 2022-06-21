package employeewage;

public class Employeewage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		
		// Employee Present or Absent
		int employeePresent = 1;
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (isPresent == employeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
