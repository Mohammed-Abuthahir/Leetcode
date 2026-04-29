// 3834. Merge Adjacent Equal Elements
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class mergeadjecentequals{
    public static List<Long> mergeAdjecent(int[] nums){
        Stack<Long> stack = new Stack<>();
        for(int num : nums){
            if(!stack.isEmpty() && stack.peek() == num){
                long sum = stack.pop() + num;
                while(!stack.isEmpty() && stack.peek() == sum){
                    sum = sum + stack.pop();
                }
                stack.push(sum);
            }
            else{
                stack.push((long) num);
            }
        }
        List<Long> arr = new ArrayList<>();
        for(long num : stack){
            arr.add(num);
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        List<Long> result = mergeAdjecent(nums);
        System.out.println(result);
    }
}