// 3483. Unique 3-Digit Even Numbers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class evenNumber{
    public static int totalNumbers(int[] digit) {
       int count = 0;
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0;i < digit.length; i++){
            for(int j = 0;j < digit.length; j++){
                for(int k = 0;k < digit.length; k++){
                    if(i != j && j != k && k != i){
                        int num = digit[i] * 100 + digit[j] * 10 + digit[k];
                        if(num >= 100 && num % 2 == 0){
                            count++;
                        }
                    }
                }
            }
       }
       return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = totalNumbers(nums);
        System.out.println(result);
    }
}