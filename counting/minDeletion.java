// 3545. Minimum Deletions for At Most K Distinct Characters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minDeletion{
    public static int mindel(String s, int k){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int d = map.size() - k;
        if(d <= 0) return 0;    
        int sum = 0;
        for(int i = 0;i < d; i++) sum = sum + list.get(i);
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        System.out.println("Enter the K : ");
        int k = scan.nextInt();
        int result = mindel(s, k);
        System.out.println(result);
    }
}