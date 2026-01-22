// 2000. Reverse Prefix of Word
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseprefixword{
    public static String reverse(String s,char ch){
        int index = 0;
        char[] arr = s.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == ch){
                index = i;
                break;
            }
        }
        int left = 0;
        int right = index;
        while(left <= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the Ed Point Character :");
        char c = scan.next().charAt(0);
        String result = reverse(s,c);
        System.out.println("result :" + result);
    }
}