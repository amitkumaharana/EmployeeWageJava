public class employeewage{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program");
		int daily_employee_wage = 0, wage_per_hour = 20, full_day_hour = 8, part_time_hour = 8, monthly_wage = 0, total_working_hour = 0, total_working_days = 0;
		while(total_working_hour<100 && total_working_days<20){
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
							total_working_hour += part_time_hour;
							break;
						case 1:
							daily_employee_wage = wage_per_hour * full_day_hour;
							System.out.println("Worked Full Time");
							System.out.println("Full time daily working wage is  "+daily_employee_wage);
							total_working_hour += full_day_hour;
							break;
					}
					break;

				case 1:
					System.out.println("Employee Absent");
					daily_employee_wage = 0;
					break;
			}
			total_working_days++;
			monthly_wage += daily_employee_wage;
		}
		System.out.println("Monthly wage of employee is  "+monthly_wage);
		System.out.println("Total working days are "+total_working_days);
		System.out.println("Total working hours are "+total_working_hour);
	}
}
