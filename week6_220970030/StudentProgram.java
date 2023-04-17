import java.util.Scanner;

class Student
{
	int regNo, sem;
	String name, course;

	Student()
	{
		regNo = sem = -1;
		name = course = "Undefined";
	}

	void get_data(Scanner sc)
	{
		System.out.println("Enter register no.: ");
		regNo = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter course: ");
		course = sc.next();
		System.out.println("Enter semester: ");
		sem = sc.nextInt();
	}

	void display()
	{
		System.out.println("Register no.: "+ regNo);
		System.out.println("Name: "+ name);
		System.out.println("Course: "+ course);
		System.out.println("Semeseter: "+ sem);
	}
}

class Exam extends Student{
	float m1, m2, m3;
	Exam()
	{
		m1 = m2 = m3 = 0;
	}

	void get_data(Scanner sc)
	{
		super.get_data(sc);
		System.out.println("Enter mark-1: ");
		m1 = sc.nextFloat();
		System.out.println("Enter mark-2: ");
		m2 = sc.nextFloat();
		System.out.println("Enter mark-3: ");
		m3 = sc.nextFloat();
	}

	void display()
	{
		super.display();
		System.out.println("Mark 1: "+ m1);
		System.out.println("Mark 2: "+ m2);
		System.out.println("Mark 3: "+ m3);
	}
}

class Result extends Exam
{
	float totalMark;
	String grade;

	Result()
	{
		totalMark = 0;
		grade = "-";
	}

	void get_data(Scanner sc)
	{
		super.get_data(sc);
		totalMark = m1 + m2 + m3;
		float perc = totalMark/300*100;
		if(perc > 90)
			grade = "A";
		else if(perc > 80)
			grade = "B";
		else if(perc > 70)
			grade = "C";
		else if(perc > 60)
			grade = "D";
		else if(perc > 50)
			grade = "E";
		else
			grade = "F";
	}

	void display()
	{
		super.display();
		System.out.println("Total mark: "+totalMark);
		System.out.println("Grade: "+grade);
	}

}


class StudentProgram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Result res = new Result();
		res.get_data(sc);
		res.display();
	}
}