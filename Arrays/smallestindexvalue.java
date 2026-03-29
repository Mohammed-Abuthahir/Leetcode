// 2057. Smallest Index With Equal Value
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallestindexvalue{
    public static int smallestEqual(int[] nums) {
        for(int i = 0;i < nums.length ;i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }
        return -1;
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
        int result = smallestEqual(nums);
        System.out.println(result);
    }
}