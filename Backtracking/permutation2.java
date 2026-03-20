// 47. permutation - 2
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class permutation2{
    public static void getPermutation(Set<List<Integer>> result,int[] nums,int idx){
        if(idx == nums.length - 1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < nums.length;i++){
                list.add(nums[i]);
            }
            result.add(list);
            return;
        }
        for(int i = idx;i < nums.length;i++){
            swap(i, idx, nums);
            getPermutation(result,nums,idx + 1);
            swap(i , idx ,nums);
        }
    }
    public static void swap(int i,int j ,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> permutation(int[] nums){
        Set<List<Integer>> result = new HashSet<>();
        getPermutation(result,nums,0);
        return new ArrayList<>(result);
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
        List<List<Integer>> result = permutation(nums);
        System.out.println(result);
    }
}