import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class LongestConsecutiveSequence{
    public static int longestsequence(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int[] arr = new int[set.size()];
        int j = 0;
        for(int setElement : set){
            arr[j++] = setElement;
        }
        int count = 1;
        int max = Integer.MIN_VALUE;
        int left = 0;
        for(int right = 1;right<arr.length;right++){
            if(arr[right] - arr[left] == 1){
                count++;
                left++;
                max = Math.max(max , count);
            }
            else{
                count = 1;
                left++;
            }
        }
        if(max <= 0){
            return 1;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = longestsequence(nums);
        System.out.println("Longest Consecutive : "+result);

    }
}