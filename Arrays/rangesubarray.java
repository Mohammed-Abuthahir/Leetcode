// 1508. Range Sum of Sorted Subarray Sums
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class rangesubarray{
    public static int rangesumsubarray (int[] nums,int left ,int right){
        ArrayList<Integer> subarray = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            int currsum = 0;
            for(int j = i;j < nums.length;j++){
                currsum = currsum + nums[j];
                subarray.add(currsum);
            }
        }
        Collections.sort(subarray);
        long sum = 0;
        for(int i = left - 1;i < right;i++){
            sum = (sum + subarray.get(i)) % 1_000_000_007;
        }
        return (int) sum;

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
        System.out.println("Enter the Left :");
        int left = scan.nextInt();
        System.out.println("Enter the Right :");
        int right = scan.nextInt();
        int result = rangesumsubarray(nums,left,right);
        System.out.println(result);
    }
}