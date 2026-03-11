// 3498. Reverse Degree of a String
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class reversedegree{
    public static int degree(String s){
        char[] arr = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],i + 1);
        }
        int num = 0;
        for(int i = 0;i < s.length();i++){
            num = num + (map.get(s.charAt(i)) * (i + 1));
        }
        return num;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = degree(s);
        System.out.println(result);
    }
}