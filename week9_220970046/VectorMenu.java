import java.util.ArrayList;
import java.util.Scanner;

public class VectorMenu {
    // Initialize the vector with the first five odd integers
    static ArrayList<Integer> vector = new ArrayList<>(5);
    static {
        vector.add(1);
        vector.add(3);
        vector.add(5);
        vector.add(7);
        vector.add(9);
    }

    // Define a function to display the contents of the vector
    static void display() {
        System.out.println("Vector Contents: " + vector);
    }

    // Define a function to insert an element at a specified position
    static void insertPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();
        System.out.print("Enter the position to insert at (0-indexed): ");
        int position = scanner.nextInt();
        vector.add(position, value);
        display();
    }

    // Define a function to insert an element at the end
    static void insertEnd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();
        vector.add(value);
        display();
    }

    // Define a function to delete an element
    static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position to delete (0-indexed): ");
        int position = scanner.nextInt();
        vector.remove(position);
        display();
    }

    // Define the main menu function
    static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Insert element at specified position");
            System.out.println("2. Insert element at the end");
            System.out.println("3. Delete element");
            System.out.println("4. Display contents");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insertPosition();
                    break;
                case 2:
                    insertEnd();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
