public class employeewage{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program");
		int daily_employee_wage, wage_per_hour = 20, full_day_hour = 8;
		double employee_attendance_check=Math.floor(Math.random()*10)%2;
		if (employee_attendance_check==0){
			System.out.println("Employee Present");
			daily_employee_wage = wage_per_hour * full_day_hour;
			System.out.println(daily_employee_wage);
		}
		else{
			System.out.println("Employee Absent");
		}
	}
}

