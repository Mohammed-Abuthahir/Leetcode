// 2605. Form Smallest Number From Two Digit Arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class formsmallestnumber{
    public static int minNumber(int[] nums1,int[] nums2){
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums1) list.add(num);
        for(int num : nums2){
            if(list.contains(num)){
                min = Math.min(num,min);
            }
        }
        for(int i = 0;i < nums1.length;i++){
            for(int j = 0;j < nums2.length;j++){
                String ans1 = String.valueOf(nums1[i]) + String.valueOf(nums2[j]);
                String ans2 = String.valueOf(nums2[j]) + String.valueOf(nums1[i]);
                min = Math.min(min , Integer.parseInt(ans1));
                min = Math.min(min, Integer.parseInt(ans2));
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2 :");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        int result = minNumber(nums1,nums2);
        System.out.println(result);
    }
}