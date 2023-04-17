import java.util.Scanner;

class SquaresCubes extends Thread
{
	boolean isSquare;
	int n;
	SquaresCubes(int n, boolean isSquare)
	{
		this.n = n;
		this.isSquare = isSquare;
		start();
	}

	public void run()
	{
		for(int i = 1; i < n; i++)
		{
			if(isSquare)
				System.out.println("Square("+i+") =  "+ Math.pow(i, 2));
			else
				System.out.println("Cube("+i+") = "+ Math.pow(i, 3));
		}
	}
}


class SquaresCubesPrgrm
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		SquaresCubes sq = new SquaresCubes(no, true);
		SquaresCubes cb = new SquaresCubes(no, false);

	}
}