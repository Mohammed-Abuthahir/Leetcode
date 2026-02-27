// 1688. Count of Matches in Tournament
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countmatches{
    public static int matches(int n){
        int sum = 0;
        while(n > 1){
            if((n & 1) == 0){
                sum = sum + n / 2;
                n = n / 2;
            }
            else{
                sum = sum + (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = matches(n);
        System.out.println("number of matches played in the tournament :"+result);
    }
}