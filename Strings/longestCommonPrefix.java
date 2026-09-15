// longestCommonPrefix
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class longestCommonPrefix{
    public static String longestCommonPrefix(String[] str){
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int idx = 0;
        while(idx < first.length() && idx < last.length()){
            if(first.charAt(idx) == last.charAt(idx)){
                idx++;
            }
            else break;
        }
        return str[0].substring(0, idx);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        String[] arr = new String[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scan.next();
        }
        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }
}