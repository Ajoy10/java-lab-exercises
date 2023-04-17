import java.util.Scanner;

class Box
{
	float length, width, height;


	public Box()
	{
		length = width = height = 0;

	}

	public Box(float l)
	{
		length = l; width = 1; height = 1;

	}

	public Box(float l, float w)
	{
		length = l; width = w; height = 1;

	}

	public Box(float l, float w, float h)
	{
		length = l; width = w; height = h;

	}

	double Volume()
	{
		return length * height * width;
	}

}


class BetterBox extends Box
{
	String color;
	float weight;

	public BetterBox()
	{
		color = "undefined";
		weight = 0;
	}

	public BetterBox(float l, float w, float h, float wght, String col)
	{
		super(l,w,h);
		color = col;
		weight = wght;
	}

	void Display()
	{
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Volume: " + Volume());
		System.out.println("Weight: " + weight);
		System.out.println("Color: " + color);
	}
}

class BoxProgram
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length, Width, Height, Weight and Color: ");
		BetterBox box = new BetterBox(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextLine());
		box.Display();
	}

}