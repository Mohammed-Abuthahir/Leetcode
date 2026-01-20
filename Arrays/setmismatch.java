// 645. Set Mismatch
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class setmismatch{
    public static int[] setmismatch(int[] nums){
        int j = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                nums[j++] = num;
            }
            else{
                set.add(num);
            }
        }
        int missing = 1;
        while(set.contains(missing)){
            missing++;
        }
        nums[j++] = missing;
        return Arrays.copyOf(nums,j);
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
        int[] result = setmismatch(nums);
        System.out.println("result :"+Arrays.toString(result));
    }
}