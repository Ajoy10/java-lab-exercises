import java.util.Scanner;

class Stack
{
	int arr[];
	int size;
	int TOS;

	Stack(int size)
	{
		TOS = -1;
		this.size = size;
		this.arr = new int[size];
	}

	boolean isEmpty()
	{
		return TOS == -1;
	}

	boolean isFull()
	{
		return (TOS >= size-1);
	}

	public void Display()
	{
		System.out.println("Stack");
		for(var ele : arr)
		{
			System.out.println(ele);
		}
	}

	public static void Push(Stack st, int val)
	{
		if(st.isFull()){
			System.out.println("Stack overflow!");
			return;
		}

		st.TOS++;
		st.arr[st.TOS] = val;
	}

	public static Integer Pop(Stack st){
		if(st.isEmpty())
		{
			System.out.println("Stack underflow!");
			return null;
		}

		int data = st.arr[st.TOS];
		st.TOS--;
		return data;
	}
}

class StackProgram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter size of Stack: ");
		int size = sc.nextInt();
		Stack st = new Stack(size);

		System.out.print("Enter no. of item to push: ");
		int count = sc.nextInt();
		System.out.println("Enter "+count+" no.s:");
		for(int i = 0; i < count; i++)
		{
			int item =  sc.nextInt();
			Stack.Push(st, item);
		}

		
		System.out.print("Enter no. of item to pop: ");
		count = sc.nextInt();
		System.out.println("Numbers popped:");
		for(int i = 0; i < count; i++)
		{
			System.out.println(Stack.Pop(st));
		}
	}
}