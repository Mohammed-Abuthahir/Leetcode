// 2325. Decode the Message
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class decodemessage{
    public static String decoding(String key, String message){
        LinkedHashMap<Character, Character> map = new LinkedHashMap<>();
        int idx = 97;
        for(char c : key.toCharArray()){
            if(!map.containsKey(c) && c != ' '){
                map.put(c , (char) (idx++));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < message.length(); i++){
            if(message.charAt(i) != ' '){
                sb.append(map.get(message.charAt(i)));
            }
            else{
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Key :");
        String key = scan.nextLine();
        System.out.println("Enter the message :");
        String message = scan.nextLine();
        String result = decoding(key , message);
        System.out.println(result);
    }
}