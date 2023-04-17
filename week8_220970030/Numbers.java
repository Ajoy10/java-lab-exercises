import java.util.*;
class Numbers{

	static Scanner sc;

	static int[] InputArray(){

		int count;
		System.out.println("Enter size: ");
		count = sc.nextInt();
		int arr[] = new int[count];
		System.out.println("Enter "+count+" elements: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		int arr1[] = InputArray();
		int arr2[] = InputArray();

		System.out.print("Output:");
		for(int i = 0; i < arr1.length; i++)
		{
			try{
				arr1[i] /= arr2[i];
				System.out.println(arr1[i]+" ");
			}
			catch(ArithmeticException ex)
			{
				System.out.println(ex);
			}catch(IndexOutOfBoundsException ex)
			{
				System.out.println(ex);
			}
		}
	}

}