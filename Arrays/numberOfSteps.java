// 1342. Number of Steps to Reduce a Number to Zero
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numberOfSteps{
    public static int number(int n){
        int count = 0;
        while(n != 0){
            if(n % 2 == 0) n = n / 2;
            else n = n - 1;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = number(n);
        System.out.println(result);
    }
}