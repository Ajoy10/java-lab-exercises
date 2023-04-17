import CToF.CelsToFahr;
import FToC.FahrToCels;

import java.util.Scanner;

class TempConv
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int opt;
		System.out.print("Which one to convert? 1. C to F, 2. F to C :");
		opt = sc.nextInt();
		if(opt == 1)
		{
			System.out.print("Enter Celsius:");
			double c = sc.nextDouble();
			System.out.println(CelsToFahr.ConvertCToF(c));
		}else if(opt == 2)
		{
			System.out.print("Enter Fahrenheit:");
			double f = sc.nextDouble();
			System.out.println(FahrToCels.ConvertFToC(f));
		}else{
			System.out.println("Invalid input!");
			return;
		}



	}
}