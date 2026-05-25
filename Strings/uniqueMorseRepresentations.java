// 804. Unique Morse Code Words
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class uniqueMorseRepresentations{
    public static int uniquemorse(String[] words){
        HashMap<Character, String> map = new HashMap<>();
        String[] dashes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int idx = 0;
        for(int i = 97; i <= 122; i++){
            map.put((char) i, dashes[idx++]);
        }
        HashSet<String> set = new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < str.length(); i++){
                sb.append(map.get(str.charAt(i)));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        int result = uniquemorse(nums);
        System.out.println(result);
    }
}