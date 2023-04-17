import java.util.Scanner;

class SpeedConversion{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int option;

		do{

			double kmph, mps;

			System.out.println("1. km_per_hr to mtr_per_sec");
			System.out.println("2. mtr_per_sec to km_per_hr");
			System.out.print("Enter your choice(0 to stop): ");
			option = sc.nextInt();

			switch(option)
			{
				case 1:
					System.out.println("Enter the speed in km_per_hr: ");
					kmph = sc.nextDouble();
					mps = kmph * 1000/3600;
					System.out.println("Speed in mtr_per_sec = "+mps);
					break;
				case 2:
					System.out.println("Enter the speed in mtr_per_sec: ");
					mps = sc.nextDouble();
					kmph = mps * (3600d/1000d);
					System.out.println("Speed in km_per_sec = "+kmph);
					break;
				case 0:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Invalid!");
			}
		}while(option!=0);
	}
}