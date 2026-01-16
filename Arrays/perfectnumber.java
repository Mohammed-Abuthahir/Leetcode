// 507. Perfect Number
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class perfectnumber{
    public static boolean perfect(int num){
        int sum = 0;
        int i = 1;
        while(i < num){
            if(num % i == 0){
                sum = sum + i;
                i++;
            }
            else{
                i++;
            }
        }
        if(sum == num){
            return true;
        }
     return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scan.nextInt();
        boolean result = perfect(num);
        System.out.println("Result :"+result);
    }
}