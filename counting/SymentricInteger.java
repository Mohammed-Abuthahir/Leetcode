// 2843. Count Symmetric Integers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SymentricInteger{
    public static int countSymmetricIntegers(int low,int high){
        int count = 0;
        for(int i = low;i <= high;i++){
            String num = String.valueOf(i);
            int leftsum = 0;
            int rightsum = 0;
            int mid = (num.length() / 2);
            for(int j = 0;j < mid;j++){
                leftsum = leftsum + Integer.parseInt(String.valueOf(num.charAt(j)));
            }
            for(int k = mid;k < num.length();k++){
                rightsum = rightsum + Integer.parseInt(String.valueOf(num.charAt(k)));
            }
            if(leftsum == rightsum && num.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the low :");
        int low = scan.nextInt();
        System.out.println("Enter the High :");
        int high = scan.nextInt();
        int result = countSymmetricIntegers(low , high);
        System.out.println(result);
    }
}