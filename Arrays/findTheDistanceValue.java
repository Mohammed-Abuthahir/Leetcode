// 1385. Find the Distance Value Between Two Arrays
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findTheDistanceValue{
    public static int findvalue(int[] nums1 , int[] nums2){
        int realcount = 0;
        for(int i = 0; i < arr1.length; i++){
            int count = 0;
            for(int num : arr2){
                if(Math.abs(arr1[i] - num) > d)  count++;
            }
            if(count == arr2.length){
                realcount++;
            }
        }
        return realcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        int result = findvalue(nums1, nums2);
        System.out.println(result);
    }
}