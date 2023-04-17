import java.util.Scanner;

class SortString
{
    static String Sort(String str, boolean considerCase){
        StringBuffer sorted = new StringBuffer(str);
        int lowest = 0;
       for(int i = 0; i < sorted.length(); i++)
       {
        lowest = i;
        for(int j = i + 1; j < sorted.length(); j++)
        {
            if(considerCase){
                if(sorted.charAt(lowest) > sorted.charAt(j)){
                    lowest = j;
                }
            }else{
                if(Character.toLowerCase(sorted.charAt(lowest)) > Character.toLowerCase(sorted.charAt(i))){
                    lowest = j;
                }
            }
        }
        Character temp = sorted.charAt(lowest);
        sorted.setCharAt(lowest, sorted.charAt(i));
        sorted.setCharAt(i, temp);
       }

       return sorted.toString();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String sorted_case =  Sort(str, true);
        String sorted_wo_case = Sort(str, false);
        System.out.println("Sorted with case: " + sorted_case);
        System.out.println("Sorted without case: " + sorted_wo_case);


    }
}