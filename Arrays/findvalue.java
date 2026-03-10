// 2011. Final Value of Variable After Performing Operations
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findvalue{
    public static int operations(String[] nums){
        int x = 0;
        for(String num : nums){
            if(num.equals("--X")){
                --x;
            }
            else if(num.equals("X--")){
                x--;
            }
            else if(num.equals("X++")){
                x++;
            }
            else if(num.equals("++X")){
                ++x;
            }
        }
        return x;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n  = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        int result = operations(nums);
        System.out.println(result);
    }
}