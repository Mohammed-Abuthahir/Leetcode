// 1460. Make Two Arrays Equal by Reversing Subarrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reversesubarray{
    public static boolean reverse(int[] nums1,int[] nums2){
        ArrayList<Integer> set = new ArrayList<>();
        for(int num : nums1) set.add(num);
        for(int num : nums2){
            if(!set.contains(num)){
                return false;
            }
            else {
                set.remove(Integer.valueOf(num));
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        boolean result = reverse(nums1, nums2);
        System.out.println(result);
    }
}