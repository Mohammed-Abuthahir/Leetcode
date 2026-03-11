// 2553. Separate the Digits in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class seperatedigits{
    public static int[] seperates(int[] nums){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums){
            if(num < 10){
                arr.add(num);
            }
            else{
                String n = String.valueOf(num);
                for(char c : n.toCharArray()){
                    arr.add(c - '0');
                }
            }
        }
        int[] list = new int[arr.size()];
        int i = 0;
        for(int num : arr){
            list[i++] = num;
        }
        return list;
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
        int[] result = seperates(nums);
        System.out.println(Arrays.toString(result));
    }
}