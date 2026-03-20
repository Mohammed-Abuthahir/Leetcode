// 438. Find All Anagrams in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class AnagramsinString{
    public static List<Integer> anagrams(String s,String p){
        ArrayList<Integer> list = new ArrayList<>();
        int k = p.length();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        for(int i = 0;i <= s.length() - k;i++){
            String sub = s.substring(i , i + k);
            char[] nums = sub.toCharArray();
            Arrays.sort(nums);
            if(String.valueOf(arr).equals(new String(nums))){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the P :");
        String p = scan.next();
        List<Integer> result = anagrams(s, p);
        System.out.print(result);
    }
}