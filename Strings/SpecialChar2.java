// 3121. Count the Number of Special Characters II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SpecialChar2{
    public static int numberOfSpecialChars(String s){
        HashMap<String, Integer> lastLowerMap = new HashMap<>();
        HashMap<String, Integer> firstUpperMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String chStr = String.valueOf(s.charAt(i));
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lastLowerMap.put(chStr, i); 
            } else {
                if(!firstUpperMap.containsKey(chStr)) {
                    firstUpperMap.put(chStr, i); 
                }
            }
        }
        ArrayList<String> lower = new ArrayList<>();
        ArrayList<String> upper = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            String chStr = String.valueOf(s.charAt(i));
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(!lower.contains(chStr)) lower.add(chStr); 
            }
            else{
                if(!upper.contains(chStr)) upper.add(chStr); 
            }
        }
        int count = 0;
        ArrayList<String> processedChars = new ArrayList<>(); 
        for(int i = 0; i < upper.size(); i++){
            String upperChar = upper.get(i);
            String targetLower = upperChar.toLowerCase();
            if(lower.contains(targetLower)){
                if(firstUpperMap.get(upperChar) > lastLowerMap.get(targetLower) && !processedChars.contains(targetLower)){
                    count++;
                    processedChars.add(targetLower); 
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = numberOfSpecialChars(s);
        System.out.println(result);
    }
}