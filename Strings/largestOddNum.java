// 1903. Largest Odd Number in String
import java.util.*;
class largestOddNum{
    public static String largest(String num){
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {    
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nUmber ");
        String num = scan.nextLine();
        String result = largest(num);
        System.out.println(result);
    }
}