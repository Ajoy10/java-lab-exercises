import java.util.Scanner;

class TutionFee
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the fee:");
		float fee = sc.nextFloat();
		System.out.print("Enter the rate of increase(0% - 100%):");
		float rateOfIncrease = sc.nextFloat() / 100f ;
		System.out.print("Enter the no. of years:");
		int yearsToShow = sc.nextInt();

		for(int i = 0; i < yearsToShow; i++)
		{
			fee += fee * rateOfIncrease;
			System.out.println("The fee after "+(i+1)+" year = "+fee);
		}

	}
}