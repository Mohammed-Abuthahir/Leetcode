// 3692. Majority Frequency Characters
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class majorityfreqChar{
    public static String majorityFrequencyGroup(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,  0) + 1);
        }
        HashMap<Integer , List<Character>> map1 = new HashMap<>();
        for(char key : map.keySet()){
            map1.putIfAbsent(map.get(key),new ArrayList<>());
            map1.get(map.get(key)).add(key);
        }

        int maxGroup = 0; int max = 0;
        for(List<Character> subset : map1.values()){
            maxGroup = Math.max(maxGroup, subset.size());
        }
        for(int key : map1.keySet()){
            if(map1.get(key).size() == maxGroup){
                max = Math.max(key, max);
            }
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int key : map1.keySet()){
            if(map1.get(key).size() == maxGroup){
                count++;
            }
        }
        if(count == 1){
            for(int key : map1.keySet()){
                if(map1.get(key).size() == maxGroup){
                    for(int i = 0;i < map1.get(key).size();i++){
                        sb.append(map1.get(key).get(i));
                    }
                }
            }
        }
        else{
            for(int key : map1.keySet()){
                if(map1.get(key).size() == maxGroup  && max == key){
                    for(int i = 0;i < map1.get(key).size();i++){
                        sb.append(map1.get(key).get(i));
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = majorityFrequencyGroup(s);
        System.out.println(result);
    }
}