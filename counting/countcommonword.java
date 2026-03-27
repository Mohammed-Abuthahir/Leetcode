// 2085. Count Common Words With One Occurrence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countcommonword{
    public static int countWords(String[] words1,String[] words2){
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i = 0;i < words1.length;i++){
            map1.put(words1[i],map1.getOrDefault(words1[i], 0) + 1);
        }
        for(int i = 0;i < words2.length;i++){
            map2.put(words2[i],map2.getOrDefault(words2[i], 0) + 1);
        }
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for(String word : words1){
            set1.add(word);
        }
        for(String word : words2){
            set2.add(word);
        }
        int count = 0;
        for(String word : words1){
            if(set2.contains(word) && map2.get(word) == 1 && map1.get(word) == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the N2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Array 1 :");
        String[] words1 = new String[n1];
        for(int i = 0;i < words1.length;i++){
            words1[i] = scan.next();
        }
        System.out.println("Enter the Arrays 2 :");
        String[] words2 = new String[n2];
        for(int i = 0;i < words2.length;i++){
            words2[i] = scan.next();
        }
        int result = countWords(words1,words2);
        System.out.println(result);
    }
}