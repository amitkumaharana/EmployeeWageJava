public class employeewage{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program");
		double employee_attendance_check=Math.floor(Math.random()*10)%2;
		if (employee_attendance_check==0){
			System.out.println("Employee Present");
		}
		else{
			System.out.println("Employee Absent");
		}
	}
}

