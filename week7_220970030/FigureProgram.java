import java.util.Scanner;

abstract class Figure
{
	int a,b;
	abstract double area();
}

class Triangle extends Figure
{
	Triangle(int a, int b)
	{
		this.a = a; this.b = b;
	}

	double area()
	{
		return 0.5 * a * b;
	}
}

class Rectangle extends Figure
{
	Rectangle(int a, int b)
	{
		this.a = a; this.b = b;
	}

	double area()
	{
		return a * b;
	}
}

class FigureProgram
{
	public static void main(String args[])
	{
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth, height of triangle: ");
		x = sc.nextInt(); y = sc.nextInt();
		Triangle t = new Triangle(x, y);
		System.out.println("Enter length, height of rectangle: ");
		x = sc.nextInt(); y = sc.nextInt();
		Rectangle r = new Rectangle(x,y);

		Figure fig;
		fig = t;

		System.out.println("Area of Triangle: " + fig.area());
		fig = r;
		System.out.println("Area of Rectangle: " + fig.area());

	}
}