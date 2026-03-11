// 3823. Reverse Letters Then Special Characters in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseletterandspecialchar{
    public static String reversing(String s){
        char[] arr = s.toCharArray();
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> specialchar = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                letter.add(s.charAt(i));
                arr[i] = '1';
            }
            else{
                specialchar.add(s.charAt(i));
                arr[i] = '0';
            }
        }
        Collections.reverse(letter);
        Collections.reverse(specialchar);
        int j = 0,k = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == '1'){
                arr[i] = letter.get(j++);
            }
            else{
                arr[i] = specialchar.get(k++);
            }
        }
        return new String(arr);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = reversing(s);
        System.out.println(result);
    }
}