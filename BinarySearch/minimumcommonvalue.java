// 2540. Minimum Common Value
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumcommonvalue{
    public static int minimum(int[] nums1,int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        int min =Integer.MAX_VALUE;
        for(int num : nums2){
            if(set.contains(num)){
                min = Math.min(min,num);
            }
        }
        return min == Integer.MIN_VALUE ? -1 : min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays2 :");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        int result = minimum(nums1,nums2);
        System.out.println("Minimum Common Value :"+result);
    }
}