import java.util.Scanner;

class BMI{

	public static void main(String args[])
	{
		int weight, heightInCM;
		float heightInM;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter weight in KG: ");
		weight = sc.nextInt();
		System.out.print("Enter height in cm: ");
		heightInCM = sc.nextInt();

		heightInM = heightInCM / 100f;


		double calculatedBMI = weight / (heightInM * heightInM);
		System.out.println("BMI = " + calculatedBMI);

		String message;

		if(calculatedBMI < 18.5f)
		{
			message = "Underweight";
		}else if(calculatedBMI < 24.5f){
			message = "Normal";
		}else if(calculatedBMI < 29.9f){
			message = "Overweight";
		}else if(calculatedBMI > 30){
			message = "Obese";
		}else
		{
			message = "Error!";
		}

		System.out.println(message);

	}
}