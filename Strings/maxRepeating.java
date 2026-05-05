// 1668. Maximum Repeating Substring
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxRepeating{
    public static int maxrepeat(String nums, String word){
        int count = 0;
        String temp = word;
        while(nums.contains(temp)){
            count++;
            temp = temp + word;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String nums = scan.next();
        System.out.println("Enter the word :");
        String word = scan.next();
        int result = maxrepeat(nums, word);
        System.out.println(result);
    }
}