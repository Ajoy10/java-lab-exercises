import java.util.Scanner;

class Employee{
	int code;
	String name;

	double basic, hra, pf, netSalary, grossSalary;

	final double it = 200;

	void Input(Scanner sc)
	{
		System.out.println("Enter employee code: ");
		code = sc.nextInt();

		System.out.println("Enter employee name: ");
		name = sc.next();

		System.out.println("Enter basic salary: ");
		basic = sc.nextInt();

	}

	void CalculateNetSalary()
	{
		hra = 0.075 * basic;
		pf = 0.12 * basic;

		grossSalary = basic + hra;
		netSalary = grossSalary - (it + pf);
	}

	void DisplayNetSalary()
	{
		System.out.println("Net salary: " + netSalary);
	}

}


class EmployeeProgram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		emp.Input(sc);
		emp.CalculateNetSalary();
		emp.DisplayNetSalary();
	}
}