// 2442. Count Number of Distinct Integers After Reverse Operations
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countreversedigit{
    public static int countNumber(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            int reverse = 0;
            while(num > 0){
                int rem = num % 10;
                reverse = (reverse * 10) + rem;
                num = num / 10;
            }
            set.add(reverse);
        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = countNumber(nums);
        System.out.println("Count Number of Distinct Integers After Reverse Operations :"+result);
    }
}