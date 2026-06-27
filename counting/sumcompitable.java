// 3954. Sum of Compatible Numbers in Range I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumcompitable{
    public static int sumOfGoodInteger(int n, int k){
        int sum = 0;
        for(int i = 1;i <= n + k; i++){
            if(Math.abs(n - i) <= k && (n & i) == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = sumOfGoodInteger(n, k);
        System.out.println(result);
    }
}