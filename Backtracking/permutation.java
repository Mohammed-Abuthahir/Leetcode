// 46. permutation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class permutation{
    public static void permutation(List<List<Integer>> result,int[] nums,int idx){
        int n = nums.length;
        if(idx == n - 1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < nums.length;i++){
                list.add(nums[i]);
            }
            result.add(list);
            return;
        }
        for(int i = idx;i < nums.length;i++){
            swap(i, idx, nums);
            permutation(result,nums,idx + 1);
            swap(i, idx, nums);
        }
    }
    public static void swap(int i ,int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> Backtracking(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        permutation(result,nums,0);
        return result;
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
        List<List<Integer>> result = Backtracking(nums);
        System.out.println(result);
    }
}