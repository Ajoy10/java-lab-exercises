import java.util.Scanner;


class Date
{
	int d, m, y;

	Date(){
		d = 1; m = 1; y=2023;
	}

	Date(Date copy)
	{
		d = copy.d;
		m = copy.m;
		y = copy.y;
	}

	void Input(Scanner sc)
	{
		System.out.println("Enter day, month, year: ");
		d= sc.nextInt(); m = sc.nextInt(); y = sc.nextInt();
	}

	void AddDays(int days)
	{
		while(days > 0){
			int daysInMonth = DaysInMonth(m,y);
			int daysLeftInMonth = daysInMonth - d + 1;
			if(days >= daysLeftInMonth)
			{

				// Add month
				if(m != 12)
					m++;
				else
				{
					m = 1;
					y++;
				}
				d = 1; // Reset day

				days -= daysLeftInMonth;

			}else{
				d += days;
				days = 0;
			}
		}
	}

	static int DaysInMonth(int month, int year)
	{
		switch(month)
		{
			case 2: if(year%4==0)
						return 29;
					else
						return 28;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:return 31;
			default: return 30;
		}
	}

	public String toString()
	{
		return d+"/"+m+"/"+y;
	}
}

class NewBornBaby
{
	String babyID, weight, motherName;
	Date dob;
	char gender;

	Date bcg, polio;

	NewBornBaby(String id, String w, Date b, String m, char g)
	{
		babyID = id;
		weight = w;
		dob = b;
		gender = g;
		motherName = m;
		bcg = new Date(dob);
		polio = new Date(dob);
		bcg.AddDays(45);
		polio.AddDays(90);
	}

	void DisplayDates()
	{
		System.out.println("BCG date: " + bcg);
		System.out.println("Polio date: "+ polio);
	}
}

class Bonus
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of entries: ");
		int n = sc.nextInt();

		NewBornBaby babies[] = new NewBornBaby[n];

		for(int i = 0; i < n; i++)
		{
			Date dob = new Date();
			System.out.println("Enter dob of baby: ");
			dob.Input(sc);
			System.out.println("Enter id, weight, mother's name and gender of baby:");
			babies[i] = new NewBornBaby(sc.next(), sc.next(), dob, sc.next(), sc.next().charAt(0) );
		}

		System.out.println("Enter baby's ID, mother's name to search: ");
		String id = sc.next();
		String m_name = sc.next();

		boolean found = false;

		for(int i = 0; i < babies.length; i++)
		{
			if(babies[i].motherName.equals(m_name) && babies[i].babyID.equals(id)){
				found = true;
				babies[i].DisplayDates();
				break;
			}
		}

		if(!found)
		{
			System.out.println("No baby found with given details!");
		}
	}
}