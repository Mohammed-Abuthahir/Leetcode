// 3912. Valid Elements in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findValidElements{
    public static List<Integer> findValidElements(List<Integer> nums){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            boolean leftValid = true;
            boolean rightValid = true;
            for(int j = 0; j < i ; j++){
                if(nums[j] >= nums[i]){
                    leftValid = false;
                    break;
                }
            }
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] >= nums[i]){
                    rightValid = false;
                    break;
                }
            }
            if(leftValid || rightValid) list.add(nums[i]);
        }
        return list;
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
        List<Integer> result = findValidElements(nums);
        System.out.println(result);
    }
}