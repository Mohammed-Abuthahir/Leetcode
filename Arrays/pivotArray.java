// 2161. Partition Array According to Given Pivot
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class pivotArray{
    public static int[] pivotarray(int[] nums,int pivot){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i < nums.length ; i++){
            if(nums[i] < pivot){
                arr.add(nums[i]);
            }
        }
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == pivot){
                arr.add(nums[i]);
            }
        }
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > pivot){
                arr.add(nums[i]);
            }
        }
        int[] nums1 = new int[arr.size()];
        for(int i = 0;i < nums1.length; i++){
            nums[i] = arr.get(i);
        }

        return nums;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i =0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Piviot");
        int pivot = scan.nextInt();
        int[] result = pivotarray(nums,pivot);
        System.out.println(Arrays.toString(result));
    }
}