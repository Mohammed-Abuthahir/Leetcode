// 1422. Maximum Score After Splitting a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class maxScore{
    public static int maxscore(String s){
        List<String> leftsubstring = new ArrayList<>();
        for(int i = 0;i < s.length(); i++){
            String sub = s.substring(0, i + 1);
            leftsubstring.add(sub);
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        List<String> rightsubstring = new ArrayList<>();
        for(int i = 0; i < sb.length(); i++){
            String sub = sb.substring(0, i + 1);
            rightsubstring.add(sub);
        }
        leftsubstring.removeLast();
        Collections.reverse(rightsubstring);
        rightsubstring.removeFirst();
        int max = 0;
        for (int i = 0; i < leftsubstring.size(); i++) {
            int left = 0;
            int right = 0;
            BigInteger leftNum = new BigInteger(leftsubstring.get(i), 2);
            BigInteger rightNum = new BigInteger(rightsubstring.get(i), 2);
            left = leftsubstring.get(i).length() - leftNum.bitCount();
            right = rightNum.bitCount();
            max = Math.max(max, left + right);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = maxscore(s);
        System.out.println(result);
    }
}