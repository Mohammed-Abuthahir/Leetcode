// 3131. Find the Integer Added to Array I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class IntegerAdd{
    public static int FindInteger(int[] nums1,int[] nums2){
        int max1 = 0;
        int max2 = 0;
        int left = 0;
        int right = nums1.length - 1;
        while(left <= right){
            max1 = Math.max(max1,Math.max(nums1[left],nums1[right]));
            max2 = Math.max(max2,Math.max(nums2[left],nums2[right]));
            left++;
            right--;
        }
        return max2 - max1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        int result = FindInteger(nums1,nums2);
        System.out.println("Answer is to :"+result);
    }
}