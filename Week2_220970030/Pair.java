import java.util.Scanner;

class Pair
{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("No. of elements: ");
		int n = sc.nextInt();

		if(n <= 0)
		{
			System.out.println("No. of elements must be greater than 0");
			return;
		}

		int arr[] = new int[n];

		System.out.print("Enter "+ n +" distinct integers:");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("Pairs:\t");
		for(int x = 0; x < n; x++)
		{
			for(int y = 0; y < n; y++)
			{
				if(arr[x]>arr[y])
				{
					System.out.print("("+arr[x]+","+arr[y]+"), ");
				}
			}
		}
		System.out.println();
	}
}