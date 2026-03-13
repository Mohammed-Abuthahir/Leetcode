// 658. Find K Closest Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Kcloseselement{
    public static List<Integer> findClosestElements(int[] nums,int k,int x){
        int left = 0;
        int right = nums.length - 1;
        while(right - left + 1 > k){
            if(Math.abs(nums[left] - x) > Math.abs(nums[right] - x)){
                left++;
            }
            else{
                right--;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left ;i <= right;i++){
            list.add(nums[i]);
        }
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        System.out.println("Enter the X :");
        int x = scan.nextInt();
        List<Integer> result = findClosestElements(nums,k,x);
        System.out.println(result);
    }
}