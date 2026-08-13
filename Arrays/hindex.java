// 274. H-Index
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class hindex{
    public static int hindex(int[] nums){
        Arrays.sort(nums);
        int idx = 1; int count = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] >= idx){
                count++;
                idx++;
            }
            else break;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = hindex(nums);
        System.out.println(result);
    }
}