import java.util.Scanner;

class PalindromeProgram
{
    static String Reverse(String str){
        String rev = "";
        for(int i = 0; i < str.length(); i++)
        {
            rev+=str.charAt(str.length() - i - 1);
        }

        return rev;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rev = Reverse(str);
        System.out.println("Reverse: " + rev);
        if(rev.equals(str)){
            System.out.println("Is a palindrome");
        }else
            System.out.println("Is not a palindrome");

    }
}