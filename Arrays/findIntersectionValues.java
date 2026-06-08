// 2956. Find Common Elements Between Two Arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findIntersectionValues{
    public static int[] intersection(int[] nums1 , int[] nums2){
        int count1 = 0;
        int count2 = 0;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int num : nums1) arr1.add(num);
        for(int num : nums2) arr2.add(num);
        for(int num : arr1){
            if(arr2.contains(num)){
                count1++;
            }
        }
        for(int num : arr2){
            if(arr1.contains(num)){
                count2++;
            }
        }
        return new int[]{count1, count2};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("ENter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays :");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}  