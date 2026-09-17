// 830. Positions of Large Groups
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class largeGroup{
    public static List<List<Integer>> largeGroup(String s){
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int n = s.length();
        for(int end = 0; end < s.length(); end++){
            if(n - 1 == end || s.charAt(end) != s.charAt(end + 1)){
                if(end - start + 1 >= 3){
                    result.add(Arrays.asList(start, end));
                }
                start = end + 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        List<List<Integer>> result = largeGroup(s);
        System.out.println(result);
    }
}