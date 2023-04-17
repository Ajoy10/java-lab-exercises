import java.util.Scanner;


class Shop
{
	int itemId;
	String name;

	int quantity;
	float unitPrice;
	float totalBill;

	void CalculateTotalBill()
	{
		totalBill = quantity * unitPrice;
	}

	void Input(Scanner sc){
		System.out.print("Enter item id: ");
		itemId = sc.nextInt();

		System.out.print("Enter item name: ");
		name = sc.next();


		System.out.print("Enter item quantity: ");
		quantity = sc.nextInt();

		System.out.print("Enter unit price: ");
		unitPrice = sc.nextFloat();

		CalculateTotalBill();
	}

	void Display()
	{
		System.out.println();
		System.out.println("Item id: #"+ itemId);
		System.out.println("Name:"+ name);
		System.out.println("Quantity: "+ quantity);
		System.out.println("Unit price: Rs. "+ unitPrice);
		System.out.println("Total bill: Rs. "+ totalBill);
		System.out.println();
	}

	void DisplayDiscount()
	{
		float discount;

		if(totalBill < 500){
			discount = 0f;
			System.out.println("No discount!");
		}else if(totalBill < 1000)
		{
			discount = 0.1f;
		}else if(totalBill < 2000)
		{
			discount = 0.12f;
		}else{
			discount = 0.15f;
		}

		System.out.println("You are eligible for " + discount * 100 +"% discount.");
		System.out.println("You only have to pay Rs. "+(totalBill - (totalBill * discount)) );
	}
}


class ShopProgram
{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int choice;
		Shop item = new Shop();

		do{
			System.out.println("1. Input item \n2. Display item\n3. Display discount");
			System.out.print("Enter a choice (0 to stop): ");
			choice = sc.nextInt();

			switch(choice){
				case 1: item.Input(sc);
						break;
				case 2: item.Display();
						break;
				case 3: item.DisplayDiscount();
						break;
			}

		}while(choice != 0);
	}
}