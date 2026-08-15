// 748. Shortest Completing Word
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class shortestCompletingWord{
    public static String shortest(String s ,String[] words){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        String answer = "";
        int min = Integer.MAX_VALUE;
        for (String word : words) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (char c : word.toCharArray()) {
                c = Character.toLowerCase(c);
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            boolean valid = true;
            for (char c : map.keySet()) {
                if (map1.getOrDefault(c, 0) < map.get(c)) {
                    valid = false;
                    break;
                }
            }
            if (valid && word.length() < min) {
                min = word.length();
                answer = word;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.nextLine();
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] words = new String[n];
        for(int i = 0;i < words.length; i++){
            words[i] = scan.next();
        }
        String result = shortest(s, words);
        System.out.println(result);
    }
}