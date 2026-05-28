// 2114. Maximum Number of Words Found in Sentences
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mostWordsFound{
    public static int mostwordsfound(String[] nums){
        int max = 0;
        for(String num : nums){
            String[] input = num.split(" ");
            max = Math.max(max, input.length);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextLine();
        }
        int result = mostwordsfound(nums);
        System.out.println(Arrays.toString(nums));
    }
}