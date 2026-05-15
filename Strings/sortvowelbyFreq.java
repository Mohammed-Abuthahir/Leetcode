// 3913. Sort Vowels by Frequency
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortvowelbyFreq{
    public static boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static String sortVowel(String s){
        char[] arr = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < arr.length; i++){
            if(isvowel(arr[i])){
                list.add((int) arr[i]);
                arr[i] = '1';
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < list.size(); i++){
            map.put(list.get(i), map.getOrDefault(list.get(i) , 0) + 1);
        }
        ArrayList<Integer> nums = new ArrayList<>(map.keySet());
        Collections.sort(nums, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b).compareTo(map.get(a));
            }
            return Integer.compare(list.indexOf(a), list.indexOf(b));
        });
        ArrayList<Character> list1 = new ArrayList<>();
        for(int num : nums){
            for(int i = 0; i < map.get(num); i++){
                list1.add((char) num);
            }
        }
        int idx = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == '1'){
                arr[i] = list1.get(idx++);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = sortVowel(s);
        System.out.println(result);
    }
}