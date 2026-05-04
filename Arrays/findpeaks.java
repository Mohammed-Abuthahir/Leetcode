// 2951. Find the Peaks
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findpeaks{
    public static List<Integer> findPeaks(int[] nums){
        List<Integer> result = new ArrayList<>();
        for(int i = 1;i < nums.length - 1; i++){
            if(nums[i - 1] < nums[i] && nums[i] > nums[i + 1]){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        List<Integer> result = findPeaks(nums);
        System.out.println(result);
    }
}