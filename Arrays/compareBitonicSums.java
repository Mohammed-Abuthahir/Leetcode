// 3909. Compare Sums of Bitonic Parts
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class compareBitonicSums{
    public static int comparebitonic(int[] nums) {
       long ascendingsum = 0;
       long decendingsum = 0;
       int index = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                index = i;
                break;
            }
        }
        for(int i = 0;i <= index; i++){
            ascendingsum = ascendingsum + nums[i];
        }
        for(int i = index; i < nums.length; i++){
            decendingsum = decendingsum + nums[i];
        }
        if(ascendingsum == decendingsum) return -1;
        return ascendingsum > decendingsum ? 0 : 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = comparebitonic(nums);
        System.out.println(result);
    }
}