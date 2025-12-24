// 3110. Score of a String
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ScoreaString{
    public static int valuesofadjacent(String s){
        int sum = 0;
        for(int i = 0;i<s.length()-1;i++){
            sum = sum + Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = valuesofadjacent(s);
        System.out.println("value of Adjacent :"+result);
    }
}