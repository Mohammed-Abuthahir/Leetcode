// 3226. Number of Bit Changes to Make Two Integers Equal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minChanges{
    public static int minchange(int n, int k){
        String num1 = Integer.toBinaryString(n);
        String num2 = Integer.toBinaryString(k);
        while(num1.length() > num2.length()){
            num2 = "0" + num2;
        }
        int count = 0;
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        boolean minchange = false;
        for(int i = 0;i < arr1.length;i++){
            if(arr1[i] == '1' && arr2[i] == '0'){
                arr1[i] = '0';
                count++;
            }
            if(new String(arr1).equals(num2)){
                minchange = true;
                break;
            }
        }
        if(minchange) return count;
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minchange(n, k);
        System.out.println(result);
    }
}