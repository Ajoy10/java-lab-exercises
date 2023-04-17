import java.util.Scanner;

class FuelDistanceEstimation
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the distance(in Km): ");
		float distance = sc.nextFloat();

		System.out.print("Enter the fuel consumed(in Litre): ");
		float litre = sc.nextFloat();

		float avgFuelEconomy = distance / litre;

		System.out.println("Average fuel economy = " + avgFuelEconomy + " kmpl");


		int option;

		do{

			System.out.println("1. Dist estimation");
			System.out.println("2. Fuel estimation");
			System.out.print("Enter your choice(0 to stop): ");
			option = sc.nextInt();

			switch(option){
				case 1: System.out.print("Enter the fuel consumed(in Litre): ");
						double fuelToCalc = sc.nextDouble();
						double estimatedDistance = fuelToCalc * avgFuelEconomy;
						System.out.println("Estimated distance = " + estimatedDistance);
						break;
				case 2: System.out.print("Enter the distance(in KM): ");
						double distanceToCalc = sc.nextDouble();
						double estimatedFuel = distanceToCalc/ avgFuelEconomy;
						System.out.println("Estimated fuel = " + estimatedFuel);
						break;
				case 0: System.out.println("Exiting...");
						break;
				default: System.out.println("Invalid output!");
			}

		}while(option!=0);

	}
}