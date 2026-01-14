// 917. Reverse Only Letters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseonyletter{
    public static String reversingletter(String s){
        char[] nums = s.toCharArray();
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(Character.isLetter(nums[left]) && Character.isLetter(nums[right])){
                char temp = nums[left];
                nums[left] = nums[right];
                nums[right]  = temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(nums[left])){
                left++;
            }
            else if(!Character.isLetter(nums[right])){
                right--;
            }
        }
        return new String(nums);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = reversingletter(s);
        System.out.println("After Reverse :"+result);
    }
}