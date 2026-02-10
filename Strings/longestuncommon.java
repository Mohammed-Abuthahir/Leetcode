// 521. Longest Uncommon Subsequence I
import java.util.Scanner;
import java.util.Arrays;
class longestuncommon{
    public static int uncommon(String s1,String s2){
        return s1.equals(s2) == true ? -1 : Math.max(s1.length(),s2.length());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);;
        System.out.println("Enter the First String :");
        String s1 =scan.nextLine();
        System.out.println("Enter the Second String :");
        String s2 = scan.nextLine();
        int result = uncommon(s1,s2);
        System.out.println(result);
    }
}