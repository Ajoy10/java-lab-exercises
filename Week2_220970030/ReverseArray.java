import java.util.Scanner;

class ReverseArray{

	static int ReverseNumber(int no){

		int absNo = Math.abs(no); // Getting abs value to process -ve no.s also

		int rev = 0;

		while(absNo > 0)
		{
			int digit = absNo % 10;
			rev = rev*10 + digit;
			absNo = absNo / 10;
		}

		// Reassigning original number's sign
		rev = rev * (no / Math.abs(no));


		return rev;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Number of elements: ");
		int n = sc.nextInt();

		if(n <= 0)
		{
			System.out.println("No. of elements must be greater than 0");
			return;
		}

		int arr[] = new int[n];
		int revArr[] = new int[n];
		System.out.print("Input "+n+" integers: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			revArr[i] = ReverseNumber(arr[i]);
		}

		System.out.println("Contents of the two arrays");
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i] + "\t" + revArr[i]);
		}
	}
}