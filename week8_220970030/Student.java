import java.util.Scanner;

class MarkOutOfBound extends Exception{}

class Student
{
	public static void main(String args[])
	{
		try{

			Scanner sc = new Scanner(System.in);
			System.out.print("Student name: ");
			String name = sc.nextLine();
			System.out.print("Reg. no. :");
			String reg = sc.nextLine();
			int mark1, mark2, mark3;
			System.out.print("Marks in 3 subjects: ");
			mark1 = sc.nextInt(); mark2 = sc.nextInt(); mark3 = sc.nextInt();

			if((mark1 > 100 || mark1 < 0) || (mark2 > 100 || mark2 < 0) || (mark3 > 100 || mark3 < 0))
			{
				throw new MarkOutOfBound();
			}

			double perc = (((double)mark1 + mark2 + mark3)/300) * 100;
			String grade;
			if(perc > 90)
				grade = "A";
			else if(perc > 80)
				grade = "B";
			else if(perc > 70)
				grade = "C";
			else if(perc > 60)
				grade = "D";
			else
				grade = "F";


			System.out.println("Percentage: "+perc+"%");
			System.out.println("Grade: "+grade);


		}catch(MarkOutOfBound ex)
		{
			System.out.println("Mark Out Of Bound Exception! " + ex);
		}catch(NumberFormatException ex)
		{
			System.out.println("Number Format Exception : "+ ex);
		}
	}
}