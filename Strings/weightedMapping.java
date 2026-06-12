// 3838. Weighted Word Mapping
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class weightedMapping{
    public static String mapWordWeights(String[] words, int[] weights){
        TreeMap<Character, Integer> map = new TreeMap<>();
        int idx = 0;
        for(int i = 97; i <= 122; i++ ){
            map.put((char) i, weights[idx]);
            idx++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < words.length; i++){
            int sum = 0;
            for(char c : words[i].toCharArray()){
                sum = sum + map.get(c);
            }
            list.add(sum % 26);
        }
        List<Character> alpha = new ArrayList<>();
        for(int i = 122 ; i >= 97; i--){
            alpha.add((char) i);
        }
        StringBuilder sb =  new StringBuilder();
        for(int num : list){
            sb.append(alpha.get(num));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] words = new String[n1];
        for(int i = 0;i < words.length; i++){
            words[i]  = scan.next();
        }
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 2 :");
        int[] weights = new int[n2];
        for(int i = 0;i < weights.length; i++){
            weights[i] = scan.nextInt();
        }
        String result = mapWordWeights(words, weights);
        System.out.println(result);
    }
}