// 2490. Circular Sentence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isCircularSentence{
    public static boolean isCircular(String sentence){
        if(sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) return false;
        String[] nums = sentence.split(" ");
        if(nums.length == 1){
            if(nums[0].charAt(0) != nums[0].charAt(nums[0].length() - 1))
                return false;
        }
        else {
            for(int i = 0;i < nums.length - 1; i++){
                String first = nums[i];
                String second = nums[i + 1];
                if(first.charAt(first.length() - 1) != second.charAt(0)){
                    return false;
                }
            }
        }   
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        boolean result = isCircular(s);
        System.out.println(result);
    }
}