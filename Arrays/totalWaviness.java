// 3751. Total Waviness of Numbers in Range I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class totalWaviness{
    public static int totalwaviness(int num1, int num2){
        int count = 0;
        int n1 = 0 ; int n2 = 0; int n3 = 0;
        while(num1 <= num2){
            char[] arr = String.valueOf(num1++).toCharArray();
            for(int j = 1;j < arr.length - 1; j++){
                n1 = arr[j - 1] - '0'; n2 = arr[j] - '0'; n3 = arr[j + 1] - '0';
                if ( (n1 < n2 && n2 > n3) || (n1 > n2 && n2 < n3)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Num1 :");
        int num1 = scan.nextInt();
        System.out.println("Enter the Num2 :");
        int num2 = scan.nextInt();
        int result = totalwaviness(num1, num2);
        System.out.println(result);
    }
}