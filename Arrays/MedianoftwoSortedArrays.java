//4. Median of twoSorted Arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MedianoftwoSortedArrays{
    public static double median(int[] nums1,int[] nums2){
        int[] arr = new int[nums1.length + nums2.length];
        int j = 0;
        for(int i = 0;i<nums1.length;i++){
            arr[j++] = nums1[i];
        }
        for(int i = 0;i<nums2.length;i++){
            arr[j++] = nums2[i];
        }
        Arrays.sort(arr);
        int left = 0;
        double num = 0;
        double num1 = 0;
        double num2 = 0;
        double sum = 0;
        int mid = 0;
        int right = arr.length;
        if(arr.length % 2 != 0){
            mid = (left + right)/2;
            num = arr[mid];
            return num;
        }
        else{
            mid = (left + right)/2;
            num1 = arr[mid];
            num2 = arr[mid-1];
            sum =  (num1+ num2)/2;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2:");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1:");
        int[] nums1 = new int[n1];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2:");
        int[] nums2 = new int[n2];
        for(int i = 0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        double result = median(nums1,nums2);
        System.out.println("Median of Two Arrays :"+result);

    }
}