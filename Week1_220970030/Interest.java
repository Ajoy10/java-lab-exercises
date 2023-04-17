import java.util.Scanner;

class Interest{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Loan amount: ");
		float loanAmount = sc.nextFloat();

		System.out.print("No. of Years: ");
		int loanPeriod = sc.nextInt();

		System.out.println((10000 * (5f/12f)) / (1 - (1 / Math.pow(1 + (5f/12f), 5 * 12))));

		System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
		for(float interest = 5f; interest <= 8f; interest += (1/8f))
		{
			float monthlyInterest = interest/12f;
			double monthlyPayment = (loanAmount * monthlyInterest) / (1 - (1 / Math.pow(1 + monthlyInterest, loanPeriod * 12)));
			double totalPayment = monthlyPayment * loanPeriod * 12;

			System.out.println(interest+"\t"+monthlyPayment+"\t"+totalPayment);
		}
	}
}