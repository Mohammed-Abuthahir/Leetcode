// 1408. String Matching in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Stringmatching{
    public static List<String> stringMatching(words){
        HashSet<String> nums = new HashSet<>();
        for(String num : words){
            for(int i = 0;i < words.length; i++){
                if(num.contains(words[i]) && !num.equals(words[i])){
                    nums.add(words[i]);
                }
            }
        }
        return new ArrayList<>(nums);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the String :");
        String[] words = new String[n];
        for(int i = 0;i < words.length; i++){
            words[i] = scan.next();
        }
        List<String> result = stringMatching(words);
        System.out.println(result);
    }
}