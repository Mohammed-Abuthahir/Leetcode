
// Check If String Is a Prefix of Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class prefixArrays{
    public static boolean isPrefixString(String s, String[] arr){
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            sb.append(word);
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] arr = new String[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scan.next();
        }
        boolean result = isPrefixString(s, arr);
        System.out.println(result);
    }
}