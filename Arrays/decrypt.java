// 1652. Defuse the Bomb
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class decrypt{
    public static int[] decrypt(int[] nums, int k){
        int n = nums.length;
        int[] result = new int[n];
        if(k == 0) return result;
        for(int i = 0;i < nums.length; i++){
            int sum = 0;
            if(k > 0){
                for(int j = 1; j <= k; j++){
                    sum = sum + nums[(i + j) % n];
                }
            }
            else {
                for(int j = 1;j <= -k; j++){
                    sum = sum + nums[(i - j + n) % n];
                }
            }
            result[i] = sum;
        }
        return result;
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
        System.out.println("Enter the K : ");
        int k = scan.nextInt();
        int[] result = decrypt(nums, k);
        System.out.println(Arrays.toString(result));
    }
}