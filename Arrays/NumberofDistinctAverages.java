// 2465. Number of Distinct Averages
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class NumberofDistinctAverages{
    public static int countavareges(int[] nums){
        Arrays.sort(nums);
        HashSet <Double> set = new HashSet<>();
        int left = 0;
        int right = nums.length - 1;
        double sum = 0;
        while(left <= right){
            sum = (nums[left] + nums[right]) / 2;
            set.add(sum);
            left++;
            right--;
        }
        int avarages = set.size();
        return avarages;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = countavareges(nums);
        System.out.println("Number of Avarages is : "+result);
    }
}