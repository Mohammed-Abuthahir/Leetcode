// 3678. Smallest Absent Positive Greater Than Average
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallestAbsent{
    public static int smallestAbsent(int[] nums){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            sum = sum + num;
        }
        double avg = (double) sum / nums.length;
        int num = (int) Math.floor(avg) + 1;
        if(num <= 0){
            num = 1;
        }
        while(set.contains(num)){
            num++;
        }
        return num;
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
        int result = smallestAbsent(nums);
        System.out.println(result);
    }
}