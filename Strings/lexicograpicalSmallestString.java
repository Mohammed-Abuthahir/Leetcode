// 3216. Lexicographically Smallest String After a Swap
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class lexicograpicalSmallestString{
    public static String getSmallestString(String s){
        char[] arr = s.toCharArray();
        String smallest = s;
        for(int i = 0;i < arr.length - 1; i++){
            if((arr[i] - '0') % 2 == 0 && (arr[i + 1] - '0') % 2 == 0
            || (arr[i] - '0') % 2 != 0 && (arr[i + 1] - '0') % 2 != 0){
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if(new String(arr).compareTo(s) < 0){
                    return new String(arr);
                }
                else if(new String(arr).compareTo(s) > 0){
                    char temp1 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp1;
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = getSmallestString(s);
        System.out.println(result);
    }
}