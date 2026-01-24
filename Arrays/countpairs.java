// 2006. Count Number of Pairs With Absolute Difference K
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countpairs{
    public static void getParis(int[] nums,int i,int j,ArrayList<Integer> result ,int k){
        if(i == nums.length - 1) return;
        if(j == nums.length){
            getParis(nums,i + 1,i + 2,result,k);
            return;
        }
        int count = 0;
        if(Math.abs(nums[i] - nums[j]) == k){
            count++;
            result.add(count);
        }
        getParis(nums,i,j + 1, result,k);
    }
    public static int countKdifference(int[] nums,int k){
        ArrayList<Integer> result = new ArrayList<>();
        getParis(nums , 0 , 1 , result , k);
        int count = 0;
        for(int num : result){
            if(num != 0){
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = countKdifference(nums,k);
        System.out.println("Count Pairs is to :"+result);
    }
}
