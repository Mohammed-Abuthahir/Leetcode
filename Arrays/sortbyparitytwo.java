import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sortbyparitytwo{
     public static int[] sortArrayByParity(int[] nums) {
       ArrayList<Integer> odd = new ArrayList<>();
       ArrayList<Integer> even = new ArrayList<>();
        for(int num : nums){
            if(num % 2 != 0){
                odd.add(num);
            }
            else{
                even.add(num);
            }
        }
        int j = 0;
        for(int i = 0;i<even.size();i++){
            nums[j++] = even.get(i);
            nums[j++] = odd.get(i);
        }
        return nums;
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
        int[] result = sortArrayByParity(nums);
        System.out.println("Result :"+Arrays.toString(result));
    }
}