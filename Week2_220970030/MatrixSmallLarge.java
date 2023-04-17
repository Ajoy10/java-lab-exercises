import java.util.Scanner;

class MatrixSmallLarge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of rows and columns: ");
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();

		if(rowSize <= 0 || colSize <= 0)
		{
			System.out.println("Row size and column size should be greater than 0");
			return;
		}

		float mat[][] = new float[rowSize][colSize];

		System.out.println("Enter the "+rowSize+"X"+colSize+" matrix: ");
		for(int i = 0; i < rowSize; i++)
		{
			for(int j = 0; j < colSize; j++)
			{
				mat[i][j] = sc.nextFloat();
			}
		}

		int smallX = 0, smallY= 0;
		int largeX = 0, largeY= 0;

		for(int i = 0; i < rowSize; i++)
		{
			for(int j = 0; j < colSize; j++)
			{
				// if the current element is larger than the current largest element
				if(mat[i][j] > mat[largeX][largeY])
				{
					largeX = i;
					largeY = j;
				}else if(mat[i][j] < mat[smallX][smallY]) // else if the current element is smaller than the current smallest element
				{
					smallX = i;
					smallY = j;
				}
			}
		}

		System.out.println("The largest element = "+ mat[largeX][largeY] + ", location = ("+largeX+","+largeY+")");
		System.out.println("The smallest element = "+ mat[smallX][smallY] + ", location = ("+smallX+","+smallY+")");
	}
}