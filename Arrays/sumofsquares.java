// 2778. Sum of Squares of Special Elements 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumofsquares{
    public static int sumofsquares(int[] nums){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            int temp = i + 1;
            if(n % temp == 0){
                list.add(nums[i]);
            }
        }
        int sum = 0;
        for(int num : list){
            sum = sum + (num * num);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[size];
        for(int i = 0;i < nums.length;i++){
            nums[i]  = scan.nextInt();
        }
        int result = sumofsquares(nums);
        System.out.println(result);
    }
}