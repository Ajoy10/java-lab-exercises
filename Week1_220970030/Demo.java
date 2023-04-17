import java.util.Scanner;

class Demo{

	public static void main(String args[])
	{
		System.out.println("Hello world!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n1:");
		int n1 = sc.nextInt();
		System.out.println("Enter value of n2:");
		float n2 = sc.nextFloat();
		System.out.println("Enter value of n3:");
		double n3 = sc.nextDouble();
		System.out.println("Numbers are " + n1 + "," + n2 + ","+ n3);
	}
}