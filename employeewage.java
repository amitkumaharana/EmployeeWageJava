public class employeewage{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program");
		int daily_employee_wage, wage_per_hour = 20, full_day_hour = 8, part_time_hour = 8;
		double employee_attendance_check=Math.floor(Math.random()*10)%2;
		switch ((int)employee_attendance_check){
			case 0:
				System.out.println("Employee Present");
				double part_time=Math.floor(Math.random()*10)%2;
				switch ((int)part_time){
					case 0:
						daily_employee_wage = wage_per_hour * part_time_hour;
						System.out.println("Worked Part Time");
						System.out.println("Part time daily working wage is  "+daily_employee_wage);
						break;
					case 1:
						daily_employee_wage = wage_per_hour * full_day_hour;
						System.out.println("Worked Full Time");
						System.out.println("Full time daily working wage is  "+daily_employee_wage);
						break;
				}
				break;

			case 1:
				System.out.println("Employee Absent");
				break;
		}
	}
}

