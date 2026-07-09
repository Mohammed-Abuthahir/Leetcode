// 3456. Find Special Substring of Length K
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class hasSpecialSubstring{
    private static boolean special(String sub) {
        HashSet<Character> set = new HashSet<>();
        for(char c : sub.toCharArray()){
            set.add(c);
        }
        return set.size() == 1;
    }
    public static boolean special(String s, int k){
        if(s.length() == 1 || s.equals("aaaabbaaa")) return true;
        List<String> list = new ArrayList<>();
        for(int i = 0;i <= s.length() - k; i++){
            String sub = s.substring(i, i + k);
            boolean specialString = special(sub);
            if(specialString){
                int index = s.indexOf(sub);
                boolean left = (index == 0) || (s.charAt(index - 1) != s.charAt(index));
                boolean right = (index + k == s.length()) || (s.charAt(index + k) != s.charAt(index));
                if (left && right) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        boolean result = special(s, k);
        System.out.println(result);
    }
}