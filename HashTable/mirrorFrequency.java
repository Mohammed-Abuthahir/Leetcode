// 3889. Mirror Frequency Distance
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mirrorFrequency{
    public static int mirrorfrequency(String s){
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char num : s.toCharArray()){
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        HashMap<Character, Character> map2 = new HashMap<>();
        int idx = 122;
        for(int i = 97; i <= 122; i++){
            map2.put((char) i, (char) idx--);
        }
        HashMap<Character, Character> map3 = new HashMap<>();
        char num = '9';
        for (char ch = '0'; ch <= '9'; ch++) {
            map3.put(ch, num--);
        }
        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(char c : s.toCharArray()){
             if(map1.containsKey(c) && Character.isLetter(c)){
                sum = sum + Math.abs((map1.get(c)) - (map1.getOrDefault(map2.get(c), 0)));
                map1.remove(c);
                map1.remove(map2.get(c));
            }
            else if(map1.containsKey(c) && Character.isDigit(c)){
                sum = sum + Math.abs((map1.get(c)) - (map1.getOrDefault(map3.get(c), 0)));
                map1.remove(c);
                map1.remove(map3.get(c));
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = mirrorfrequency(s);
        System.out.println(result);
    }
}