class WageCalculate
{
	int daily_employee_wage = 0;
	int wage_per_hour = 20;
	int full_day_hour = 8;
	int part_time_hour = 8;
	int monthly_wage = 0;
	int total_working_hour = 0;
	int total_working_days = 0;
	int monthly_working_days=0;
	int monthly_working_hours=0;
	public void wage(int wage_per_hour,int monthly_working_days,int monthly_working_hours)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		while(total_working_hour<monthly_working_hours && total_working_days<monthly_working_days)
		{
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

public class employeewage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageCalculate Microsoft=new WageCalculate();
		System.out.println("Wage Compute for Microsoft");
		Microsoft.wage(20,20,100);
		WageCalculate Apple=new WageCalculate();
		System.out.println("Wage Compute for Apple");
		Apple.wage(26,18,98);
		WageCalculate Bridgelabz=new WageCalculate();
		System.out.println("Wage Compute for Bridgelabz");
		Bridgelabz.wage(38,22,84);
	}

}
