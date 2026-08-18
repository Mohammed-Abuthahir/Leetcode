// 2299. Strong Password Checker II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class strongPasswordCheckerII{
    public static boolean strongPasswordChecker(String password){
        if(password.length() < 8) return false;
        String special = "!@#$%^&*()-+";
        boolean specialChar = false;
        boolean Numbers = false;
        boolean upperCase = false;
        boolean LowerCase = false;
        for(int i = 0; i < password.length(); i++){
            int temp = i + 1;
            if(temp < password.length() - 1 && password.charAt(temp - 1) == password.charAt(temp)) return false;
            char c = password.charAt(i);
            String s = String.valueOf(c);
            if(special.contains(s)) specialChar = true;
            if(Character.isDigit(c)) Numbers = true;
            if(Character.isLowerCase(c)) LowerCase = true;
            if(Character.isUpperCase(c)) upperCase = true;
        }
        return Numbers && specialChar && LowerCase && upperCase;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        boolean result = strongPasswordChecker(s);
        System.out.println(result);
    }
}