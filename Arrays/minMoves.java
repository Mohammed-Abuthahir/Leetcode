// 3736. Minimum Moves to Equal Array Elements III
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
class minMoves{
    public static int minmovestoeqaul(int[] nums){
        int max = 0;
        for(int num : nums){
            max = Math.max(num, max);
        }
        int sum = 0;
        for(int num : nums){
            if(num != max){
                sum = sum + Math.abs(num - max);
            }
        }
        return sum;
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
        int result = minmovestoeqaul(nums);
        System.out.println(result);
    }
}