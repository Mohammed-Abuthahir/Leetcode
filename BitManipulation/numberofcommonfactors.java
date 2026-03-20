// 2427. Number of Common Factors
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numberofcommonfactors{
    public static int commonfactors(int num1 ,int num2){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0) set.add(i);
        }
        for(int i = 1;i <= num2; i++){
            if(num2 % i == 0 && set.contains(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = scan.nextInt();
        System.out.println("Enter the Num2 :");
        int num2 = scan.nextInt();
        int result = commonfactors(num1 , num2);
        System.out.println(result);
    }
}