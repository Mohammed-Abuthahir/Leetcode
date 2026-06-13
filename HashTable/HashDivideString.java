// 3271. Hash Divided String
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class HashDivideString{
    public static String stringHash(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Integer, Character> alphamap = new HashMap<>();
        int idx = 0; int idx1 = 0;
        for(int i = 97; i <= 122; i++){
            map.put((char) i, idx++);
            alphamap.put(idx1++, (char) i);
        }
        StringBuilder sb = new StringBuilder(); 
        if(k == 1){
            for(int i = 0;i < s.length(); i++){
                String sub = String.valueOf(s.charAt(i));
                int sum = 0;
                for(char c : sub.toCharArray()){
                    sum = sum + map.get(c);
                }
                sb.append(alphamap.get(sum % 26));
            }
        }
        else{
            for(int i = 0;i <= s.length() - k; i = i + k){
                String sub = s.substring(i, i + k);
                int sum = 0;
                for(char c : sub.toCharArray()){
                    sum = sum + map.get(c);
                }   
                sb.append(alphamap.get(sum % 26));  
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = stringHash(s, k);
        System.out.println(result);
    }
}
