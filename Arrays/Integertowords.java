// 273. Integer to English Words
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Integertowords{
    public static String integerToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num).trim();
    }
    private static final String[] BELOW_TWENTY = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };
    private static final String[] TENS = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private static final int BILLION = 1_000_000_000;
    private static final int MILLION = 1_000_000;
    private static final int THOUSAND = 1_000;
    private static final int HUNDRED = 100;

    private static String helper(int num) {
        if (num < 20) {
            return BELOW_TWENTY[num];
        }
        else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        }
        else if (num < 1000) {
            return helper(num / HUNDRED) + " Hundred " + helper(num % HUNDRED);
        }
        else if (num < 1_000_000) {
            return helper(num / THOUSAND) + " Thousand " + helper(num % THOUSAND);
        }
        else if (num < 1_000_000_000) {
            return helper(num / MILLION) + " Million " + helper(num % MILLION);
        }
        else {
            return helper(num / BILLION) + " Billion " + helper(num % BILLION);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        String result = integerToWords(num);
        System.out.println(result);
    }
}