// 771. Jewels and Stones
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class jewelsandstones{
    public static int numJewelsInStones(String jewels, String stones){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i < stones.length(); i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        }
        int sum = 0;
        for(char c :jewels.toCharArray()){
            sum = sum + map.getOrDefault(c , 0);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the jewels :");
        String jewels = scan.next();
        System.out.println("Enter the stones :");
        String stones = scan.next();
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }
}