import java.util.Scanner;

class GrossPay
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of hours worked: ");
		int hoursWorked = sc.nextInt();

		System.out.print("Enter the hourly rate: ");
		float hourlyRate = sc.nextFloat();

		float grossPay;
		if(hoursWorked <= 40)
		{
			grossPay = hourlyRate * hoursWorked;
		}else{
			grossPay = 40 * hourlyRate + (hoursWorked - 40) * 1.5f * hourlyRate;
		}

		System.out.println("The total pay = " + grossPay);


	}

}