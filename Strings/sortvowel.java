// 2785. Sort Vowels in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortvowel{
    public static String sortingvowel(String s){
        char[] arr = s.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'
            || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                vowel.add(arr[i]);
                arr[i] = '1';
            }
        }
        Collections.sort(vowel);
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if(Character.isDigit(arr[i])){
                arr[i] = vowel.get(j);
                j++;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = sortingvowel(s);
        System.out.println(result);
    }
}