// 3024. Type of Triangle
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class triangleType{
    public static String triangleType(int[] nums){
        if(nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[1] + nums[2] <= nums[0]) return "none";
        if(nums[0] == nums[1] && nums[1] == nums[2] && nums[0] == nums[2]) return "equilateral";
        if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) return "isosceles";
        return "scalene";
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
        String result = triangleType(nums);
        System.out.println(result);
    }
}