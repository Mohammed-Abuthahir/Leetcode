// 1461. Check If a String Contains All Binary Codes of Size K
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Allbinarycodes{
    public static boolean Binarycodes(String s,int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < s.length() - k;i++){
            set.add(Integer.parseInt(s.substring(i,i + k) , 2));
        }
        return set.size() == (int) Math.pow(2, k);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        boolean result = Binarycodes(s , k);
        System.out.println(result);
    }
}