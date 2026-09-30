// 2706. Buy Two Chocolates
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class buyChoco{
    public static int buyChocos(int[] nums, int money){
        Arrays.sort(nums);
        money < (prices[0] + prices[1]) ? money : money - (prices[0] + prices[1]);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Money : ");
        int result = buyChocos(nums,money);
        System.out.println(result);
    }
}