// 2529. Maximum Count of Positive Integer and Negative Integer
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxposorneg{
    public static int posorneg(int[] nums){
        int Positive = 0;
        int Negative = 0;
        for(int num : nums){
            if(num > 0){
                Positive++;
            }
            else if(num < 0){
                Negative++;
            }
        }
        int max = Math.max(Positive,Negative);
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the n ;");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = posorneg(nums);
        System.out.println("The max positive or negative :"+result);
    }
}