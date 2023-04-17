import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class StringListSorting {

    public static void main(String[] args) {

        // Create an ArrayList to store the strings
        List<String> stringList = new ArrayList<String>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read in five strings from the user and add them to the list
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string #" + (i+1) + ": ");
            String inputString = scanner.nextLine();
            stringList.add(inputString);
        }

        // Sort the list in alphabetical order
        Collections.sort(stringList);

        // Display the list in forward order using ang iterator
        System.out.println("List in forward order:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the list in both directions using a list iterator
        System.out.println("List in both directions:");
        ListIterator<String> listIterator = stringList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Close the scanner object
        scanner.close();
    }

}
