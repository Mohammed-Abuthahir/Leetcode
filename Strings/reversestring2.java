// 541. Reverse String II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reversestring2{
    public static String reverseString(String s, int k){
        if(s.length() < k){
            return new StringBuilder(s).reverse().toString();
        }
        ArrayList <String> arr = new ArrayList<>();
        for(int i = 0;i < s.length(); i = i + k){
            int end = Math.min(i + k, s.length());
            String sub = s.substring(i, end);
            arr.add(sub);
        }
        int count = 0;
        for(int i = 0;i < arr.size(); i++){
            if(count % 2 == 0){
                String reverse = new StringBuilder(arr.get(i)).reverse().toString();
                arr.set(i, reverse);
            }
            count++;
        }
        StringBuilder sb = new StringBuilder();
        for(String sub : arr){
            for(int i = 0; i < sub.length(); i++){
                sb.append(sub.charAt(i));
            }
        }
        int last = s.length() - 1;
        while(s.length() != sb.length()){
            sb.append(s.charAt(last));
            last--;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = reverseString(s, k);
        System.out.println(result);
    }
}