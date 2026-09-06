// 2210. Count Hills and Valleys in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countHillValley{
    public static int countHillVallay(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int num : arr){
            if(stack.peek() != num) stack.push(num);
        }
        int idx = 0;
        int[] nums = new int[stack.size()];
        for(int num : stack) nums[idx++] = num;
        int count = 0;
        for(int i = 1;i < nums.length - 1; i++){
            if(((nums[i - 1] < nums[i]) && (nums[i] > nums[i + 1]))
                    || ((nums[i - 1] > nums[i]) && (nums[i] < nums[i + 1]))){
                count++;
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
        int result = countHillVallay(nums);
        System.out.println(result);
    }
}