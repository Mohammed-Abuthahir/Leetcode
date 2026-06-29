// 2496. Maximum Value of a String in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumValue{
    public static int maximumvalue(String[] nums){
        int max = 0;
        for(String num : nums){
            if(num.matches("-?\\d+")){
                max = Math.max(max, Integer.parseInt(num));
            }
            else{
                max = Math.max(max, num.length());
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the String :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        int result = maximumvalue(nums);
        System.out.println(result);
    }
}