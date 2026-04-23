// 1704. Determine if String Halves Are Alike
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class StringAlike{
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' ||  c == 'o' || c == 'u' || c == 'A'
        || c == 'I' || c == 'O' || c == 'U' || c == 'E';
    }
    public static boolean halvesAreAlike(String s){
        int left = 0; int right = s.length();
        int mid = left + (right - left) / 2;
        char[] arr = s.toCharArray();
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for(int i = 0;i < mid; i++){
            arr1.add(s.charAt(i));
        }
        for(int i = mid; i < s.length();i++){
            arr2.add(s.charAt(i));
        }
        int count1 = 0;
        for(int i = 0;i < arr1.size(); i++){
            if(isVowel(arr1.get(i))){
                count1++;
            }
        }
        int count2 = 0;
        for(int i = 0;i < arr2.size();i++){
            if(isVowel(arr2.get(i))){
                count2++;
            }
        }
        return count1 == count2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String  :");
        String s = scan.next();
        boolean result = halvesAreAlike(s);
        System.out.println(result);
    }
}