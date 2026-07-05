// 2399. Check Distances Between Same Letters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class checkDistances{
    public static boolean checkdistance(String s, int[] distance){
        TreeMap<Character, List<Integer>> map = new TreeMap<>();
        for(int i = 0;i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), new ArrayList<>());
            }
            map.get(s.charAt(i)).add(i);
        }
        HashMap<Character,Integer> alpha = new HashMap<>();
        int idx = 0;
        for(int i = 97; i <= 122; i++){
            alpha.put((char) i, idx++);
        }
        for(char c : map.keySet()){
            int count = 0;
            for(int i = map.get(c).get(0) + 1; i < map.get(c).get(1); i++){
                count++;
            }
            if(count != distance[alpha.get(c)]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] distance = new int[n];
        for(int i = 0;i < distance.length; i++){
            distance[i] = scan.nextInt();
        }
        boolean result = checkdistance(s, distance);
        System.out.println(result);
    }
}