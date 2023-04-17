import java.util.Scanner;

class Box
{
	double width, height, depth;

	Box()
	{
		width = 0d;
		height = 0;
		depth = 0;
	}

	Box(double w, double h, double d)
	{
			width = w;
			height = h;
			depth = d;
	}

	double Volume()
	{
		return width * height * depth;
	}
}

class BoxProgram
{


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter width, height and depth: ");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double d = sc.nextDouble();

		Box b = new Box(w,h,d);

		System.out.println("Volume: "+ b.Volume());
	}
}