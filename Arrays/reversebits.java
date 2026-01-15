import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reversebits{
    public static int reversing(int n){
        String num = String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
        char[] arr = num.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int ans = Integer.parseInt(new String(arr),2);
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = reversing(n);
        System.out.println("After Reversing :"+result);
    }
}