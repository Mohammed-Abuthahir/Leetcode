
// 2103. Rings and Rods
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class RingsandRods{
    public static int countPoints(String s) {
        HashMap<Integer, List<Character>> map = new HashMap<>();
        for(int i = 0; i < s.length(); i += 2) {
            int num = s.charAt(i + 1) - '0';
            if(!map.containsKey(num)) {
                map.putIfAbsent(num, new ArrayList<>());
            }
            map.get(num).add(s.charAt(i));
        }
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(List<Character> num : map.values()){
            set.addAll(num);
            if(set.size() == 3){
                count++;
            }
            set.clear();
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = countPoints(s);
        System.out.println(result);
    }
}