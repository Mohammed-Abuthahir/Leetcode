// 1608. Special Array With X Elements Greater Than or Equal X
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class specialArray{
    public static int specialarray(int[] nums){
        int num1 = 0;
        for(int i = 0;i < nums.length * 2; i++){
            int count = 0;
            for(int num : nums){
                if(num >= i){
                    count++;
                }
            }
            if(count == i){
                num1 = count;
                break;
            }
        }
        return num1 == 0 ? -1 : num1;
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
        int result = specialarray(nums);
        System.out.print(result);
    }
}