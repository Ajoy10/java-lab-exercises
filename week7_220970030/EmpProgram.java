
import java.util.Scanner;


class Employee implements Cloneable
{
	String name;
	int id;
	String designation;
	float salary;

	Employee()
	{
		name = "";
		id = 99999;
		designation = "";
		salary = 0;
	}

	void Input(Scanner sc)
	{
		System.out.println("Enter ID\tName\tDesignation\tSalary:");
		id = sc.nextInt();
		name = sc.next();
		designation = sc.next();
		salary = sc.nextFloat();
	}

	void Show()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary);
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


class EmpProgram
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee-1: ");
		Employee emp1 = new Employee();
		emp1.Input(sc);

		Employee emp2 = (Employee)emp1.clone();



		System.out.print("Enter employee-2's new name: ");
		emp2.name = sc.next();
		System.out.println("Employee-1");
		emp1.Show();
		System.out.println("Employee-2");
		emp2.Show();



	}
}