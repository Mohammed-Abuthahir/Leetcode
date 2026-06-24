// 2094. Finding 3-Digit Even Numbers
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findEvenNumbers{
    public static int[] findevennumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    if(i != j && j != k && i != k){
                        int num = (nums[i] * 100) + (nums[j] * 10) + (nums[k]);
                        if(num % 2 == 0 && num >= 100){
                            set.add(num);
                        }
                    }
                }
            }
        }
        int[] arr = new int[set.size()];
        int idx = 0;
        for(int num : set){
            arr[idx++] = num;
        }
        Arrays.sort(arr);
        return arr;
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
        int[] result = findevennumber(nums);
        System.out.println(Arrays.toString(result));
    }
}