import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class AdjacentDiffAtMostTwo{
    public static boolean isAdjacentDiffAtMostTwo(String s){
        for(int i = 0;i < s.length() - 1; i++){
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0')) > 2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = isAdjacentDiffAtMostTwo(s);
        System.out.println(result);
    }
}