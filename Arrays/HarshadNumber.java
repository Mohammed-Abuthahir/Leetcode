// 3099. Harshad Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class HarshadNumber{
    public static int Harshad(int num){
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }
        return num % sum == 0 ? sum : -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = Harshad(num);
        System.out.println(result);
    }
}