import java.util.Scanner;

class MatrixRowSum extends Thread{
	int row[], id;
	MatrixRowSum(int id, int row[]){
		this.row = row;
		this.id = id;
		start();
	}

	public void run()
	{
		int sum = 0;
		for(int i = 0; i < 3; i++)
		{
			sum += row[i];
		}

		System.out.println("Sum["+id+"]= "+sum);
	}

}

class Matrix{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		MatrixRowSum t1 = new MatrixRowSum(0, mat[0]);
		MatrixRowSum t2 = new MatrixRowSum(1, mat[1]);
		MatrixRowSum t3 = new MatrixRowSum(2, mat[2]);
	}
}