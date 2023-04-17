import java.util.Scanner;

class Customer
{

	int id, noOfCalls;
	String name;
	long phoneNo, billNo;
	double billAmount;

	Customer()
	{
		id = 0; name = "Undefined";
	}

	void Input(Scanner sc)
	{
		System.out.print("Enter id: ");
		id = sc.nextInt();
		System.out.print("Enter name: ");
		name = sc.next();
		System.out.print("Enter phone no.: ");
		phoneNo = sc.nextLong();
		System.out.print("Enter bill no.: ");
		billNo = sc.nextLong();
		System.out.print("Enter no. of calls: ");
		noOfCalls = sc.nextInt();
	}

	void Display()
	{
		System.out.println("\nCustomer #"+id);
		System.out.println("Name: "+name);
		System.out.println("Phone no.: "+phoneNo);
		System.out.println("Bill no.: "+billNo);
		System.out.println("No. of calls: "+noOfCalls);
		System.out.println("Bill amount: Rs."+billAmount);
	}

	void CalculateBillAmount()
	{
		if(noOfCalls > 200)
		{
			billAmount = 100 + 50 * 0.60f + 50 * 0.50f + (noOfCalls - 200) * 0.40f;
		}else if(noOfCalls > 150)
		{
			billAmount = 100 + 50 * 0.60f + (noOfCalls - 150) * 0.50f;
		}else if(noOfCalls > 100)
		{
			billAmount = 100 + (noOfCalls - 10) * 0.60f;
		}else{
			billAmount = 100;
		}
	}

}

class TelephoneProgram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of customers: ");
		int n = sc.nextInt();

		Customer customers[] = new Customer[n];
		for(int i = 0; i < customers.length; i++)
		{
			customers[i] = new Customer();
			customers[i].Input(sc);
		}
		System.out.println("\nCustomers");
		for(Customer c : customers)
		{
			c.CalculateBillAmount();
			c.Display();
		}
	}
}