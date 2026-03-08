import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumdifference{
    public static int maxoddandeven(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for(int val : map.values()){
            if(val % 2 != 0){
                maxOdd = Math.max(maxOdd,val);
            }
            else{
                minEven = Math.min(minEven,val);
            }
        }
        return maxOdd - minEven;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan.next();
        int result = maxoddandeven(s);
        System.out.println(result);
    }
}