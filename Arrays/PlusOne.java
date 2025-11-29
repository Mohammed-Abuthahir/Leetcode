// input = [1,2,3] -- output = [1,2,4]
// input = [9] -- output = [1,0];
// input = [9,9] -- output = [1,0,0]; 1,0,1,0
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class PlusOne{
    public static int[] plusone(int[] nums){
        for(int i = nums.length-1;i >= 0;i--){
            if(nums[i] < 9){
                nums[i] = nums[i] + 1;
                return nums;
            }
            else{
                
                nums[i] = 0;
            }
        }
        int[] arr = new int[nums.length + 1];
        arr[0] = 1;
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = plusone(nums);
        System.out.println("Result : "+Arrays.toString(result));
    }
}
