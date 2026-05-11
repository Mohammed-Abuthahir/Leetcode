// 1299. Replace Elements with Greatest Element on Right Side
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class replaceelements{
    public static int[] replaceElements(int[] nums){
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1;i >= 0; i--){
            max = Math.max(max, nums[i]);
            list.add(max);
        }
        Collections.reverse(list);
        list.remove(list.getFirst());
        list.add(-1);
        for(int i = 0;i < nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
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
        int[] result = replaceElements(nums);
        System.out.println(Arrays.toString(result));
    }
}