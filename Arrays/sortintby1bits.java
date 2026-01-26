import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sortintby1bits{
    public static int[] sort(int[] nums){
        Integer[] arr = new Integer[nums.length];
        for(int i = 0;i < nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr,(a , b) -> {
            if(Integer.bitCount(a) != Integer.bitCount(b)){
                return Integer.bitCount(a) - Integer.bitCount(b);
            }
            else{
                return a - b;
            }
        });
        for(int i = 0;i < arr.length;i++){
            nums[i] = arr[i];
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sort(nums);
        System.out.println(Arrays.toString(result));
    }
}