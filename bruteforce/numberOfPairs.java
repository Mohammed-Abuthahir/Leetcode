// 3162. Find the Number of Good Pairs I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numberOfPairs{
    public static int numberof(int[] nums1, int[] nums2, int k){
        int count = 0;
        for(int i = 0;i < nums1.length; i++){
            for(int num : nums2){
                if((nums1[i] % (num * k)) == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = numberof(nums1, nums2, k);
        System.out.println(result);
    }
}