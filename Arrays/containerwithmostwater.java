import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class containerwithmostwater{
    public static int mostwater(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int maxArea = 0;
        while(left <= right){
            int width = right - left;
            int height = Math.min(nums[left],nums[right]);
            int area = width * height;
            maxArea = Math.max(maxArea,area);
            if(nums[left] < nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
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
        int result = mostwater(nums);
        System.out.println("Container with Most water is :"+result);
    }
}