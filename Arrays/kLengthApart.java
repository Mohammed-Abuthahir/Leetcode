// 1437. Check If All 1's Are at Least Length K Places Away
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kLengthApart{
    public static boolean kapart(int[] nums,int k){
        if(k <= 1) return true;
        int count = 0;
        int index = 0;
        for(int i = 0;i < nums.length ; i++){
            if(nums[i] == 1){
                index = i + 1;
                break;
            }
        }
        for(int i = index;i < nums.length;i++){
            if(nums[i] == 0) count++;
            if(nums[i] == 1 && count < k) return false;
            else if(nums[i] == 1 && count >= k){
                count = 0;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K");
        int k = scan.nextInt();
        boolean result = kapart(nums,k);
        System.out.println(result);
    }
}