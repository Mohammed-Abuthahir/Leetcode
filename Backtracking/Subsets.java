// 78. Subsets
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Subsets{
    public static void getSubset(List<List<Integer>> result,ArrayList<Integer> arr ,int[] nums,int s){
        result.add(new ArrayList<>(arr));
        for(int i = s;i < nums.length;i++){
            arr.add(nums[i]);
            getSubset(result,arr,nums,i + 1);
            arr.remove(arr.size() - 1);
        }
    }
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        getSubset(result,new ArrayList<>(),nums,0);
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
        List<List<Integer>> result = subset(nums);
        System.out.println("All the subset :"+result);
    }
}