import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter S1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter S2: ");
        String s2 = sc.nextLine();
        System.out.print("Enter N1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter N2: ");
        int n2 = sc.nextInt();
        
        System.out.println("Uppercase S1: " + s1.toUpperCase());
        
        System.out.println("Lowercase S2: " + s2.toLowerCase());
        
        String sub = s1.substring(n1, n1 + n2);
        System.out.println("Substring of length " + n2 + " from S1 starting at position " + n1 + ": " + sub);
        
        StringBuffer sb = new StringBuffer(s1);
        sb.insert(n1, s2);
        String inStr = sb.toString();
        System.out.println("After inserting S2 into S1 at position " + n1 + ": " + inStr);
        
        String appStr = s1.concat(s2);
        System.out.println("After appending S2 to S1: " + appStr);
    }
}