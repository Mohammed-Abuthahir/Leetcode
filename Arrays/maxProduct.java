// 3536. Maximum Product of Two Digits
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class maxProduct{
    public static int maxproducts(int n){
        String s = String.valueOf(n);
        int max = 0;
        for(int i = 0;i < s.length(); i++){
            for(int j = 0;j < s.length(); j++){
                if(i != j){
                    int num = (s.charAt(i) - '0') * (s.charAt(j) - '0');
                    max = Math.max(max, num);
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the N :");
        int n = scan.nextInt();
        int result = maxproducts(n);
        System.out.println(result);
    }
}