import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class missingnumber{
    public static int missing(int[] nums){
        Arrays.sort(nums);
        int missNum = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == missNum){
                missNum++;
            }
        }
        return missNum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = missing(nums);
        System.out.println("Missing Number is :"+result);
    }
}