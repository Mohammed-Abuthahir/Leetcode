// 2180. Count Integers With Even Digit Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countevendigit{
    public static int count(int num){
        int count = 0;
        if(num < 9){
             return num / 2;
        }
        else{
            for(int i = 1;i <= num;i++){
                    int sum = 0;
                    int temp = i;
                    while (temp > 0) {
                        int rem = temp % 10;
                        sum = sum + rem;
                        temp = temp / 10;
                    }
                    if (sum % 2 == 0) {
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = scan.nextInt();
        int result = count(num);
        System.out.println(result);
    }
}