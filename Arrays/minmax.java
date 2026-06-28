// 2293. Min Max Game
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minmax{
    public static int minmaxGame(int[] nums){
         while(nums.length > 1){
            int[] newArr = new int[nums.length / 2];
            int idx = 0;
            for(int i = 0;i < nums.length / 2; i++){
                int temp = i;
                if(temp % 2 == 0){
                    newArr[idx++] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }
                else{
                    newArr[idx++] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newArr;
        }
        return nums[0];
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
        int result = minmaxGame(nums);
        System.out.println(result);
    }
}