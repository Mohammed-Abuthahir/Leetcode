// 3712. Sum of Elements With Frequency Divisible by K
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sumofelement{
    public static int sum(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        int sum = 0;
        for(int num : nums){
            if(map.get(num) % k == 0){
                sum = sum + num;
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
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = sum(nums,k);
        System.out.println(result);
    }
}
