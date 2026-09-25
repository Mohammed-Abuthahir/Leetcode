// 2506. Count Pairs Of Similar Strings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class similarPairs{
    public static int similarPair(String[] words){
        int count = 0;
        for(int i = 0;i < words.length; i++){
            HashSet<Character> set = new HashSet<>();
            for(char c : words[i].toCharArray()) set.add(c);
            for(int j = i + 1; j < words.length; j++){
                HashSet<Character> set1 =  new HashSet<>();
                for(char c : words[j].toCharArray()) set1.add(c);
                if(set.equals(set1)) count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the String : ");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        int result = similarPair(nums);
        System.out.println(result);
    }
}