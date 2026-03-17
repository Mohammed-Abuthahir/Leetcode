// 1863. Sum of All Subset XOR Totals
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class xorsum{
    public static void getSubSet(List<List<Integer>> result,ArrayList<Integer> arr,int idx,int[] nums){
        result.add(new ArrayList<>(arr));
        for(int i = idx;i < nums.length;i++){
            arr.add(nums[i]);
            getSubSet(result,arr,i + 1,nums);
            arr.remove(arr.size() - 1);
        }
    }
    public static int xorsumofsubset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        getSubSet(result,arr,0,nums);
        for (List<Integer> subset : result) {
            int currentSum = 0;
            for (int num : subset) {
                currentSum = currentSum ^ num;
            }
            sum = sum + currentSum;
        }
        return sum;
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
        int result = xorsumofsubset(nums);
        System.out.println(result);
    }
}