import java.util.Scanner;
import java.lang.Math;

class Point
{
	int x,y;

	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	double Distance(int x, int y)
	{
		double a = Math.pow(x - this.x, 2);
		double b = Math.pow(y - this.y, 2);
		return (Math.sqrt(a+b));
	}

	double Distance(Point p2)
	{
		return Distance(p2.x, p2.y);
	}

	public String toString()
	{
		return "("+x+", "+y+")";
	}
}

class PointsProgram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Input the coordinates of p1:");
		int x = sc.nextInt(); int y = sc.nextInt();

		Point p1 = new Point(x,y);


		System.out.print("Input the coordinates of p2:");
		x = sc.nextInt(); y = sc.nextInt();

		Point p2 = new Point(x,y);


		System.out.print("Input the coordinates of p3:");
		x = sc.nextInt(); y = sc.nextInt();

		Point p3 = new Point(x,y);

		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		System.out.println("p3 = "+p3);

		System.out.println("Distance between p1 and p2 = " + p1.Distance(p2.x, p2.y));
		System.out.println("Distance between p1 and p3 = " + p1.Distance(p3));
	}
}