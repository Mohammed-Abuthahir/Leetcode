// 3722. Lexicographically Smallest String After Reverse
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class lexSmallest{
    public static String lexicalsmallest(String s){
        char[] arr = s.toCharArray();
        char[] arr1 = arr.clone();
        String smallest = s;
        for(int i = 1;i <= arr.length; i++){
            int k = i;
            int left = 0;
            int right = k - 1;
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(new String(arr).compareTo(smallest) < 0){
                smallest = new String(arr);
            }
            left = 0;
            right = k - 1;
             while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0;i < arr1.length; i++){
            int k = i;
            int left = arr.length - k;
            int right = arr.length - 1;
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(new String(arr).compareTo(smallest) < 0){
                smallest = new String(arr);
            }
             left = arr.length - k;
             right = arr.length - 1;
             while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the String :");
        String s = scan.nextLine();
        String result = lexicalsmallest(s);
        System.out.println(result);
    }
}