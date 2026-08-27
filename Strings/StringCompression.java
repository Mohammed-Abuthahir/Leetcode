// String Compression
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class StringCompression{
    public static int Stringcompression(char[] chars){
        String s = new String(chars);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length(); i++){
            if(i == s.length() - 1){
                sb.append(s.charAt(i));
                if(count != 1) sb.append(count);
                break;
            }
            if(s.charAt(i) == s.charAt(i + 1)) count++;
            else{
                sb.append(s.charAt(i));
                if(count != 1) sb.append(count);
                count = 1;
            }
        }
        for(int i = 0;i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        char[] chars = new char[n];
        for(int i = 0;i < chars.length; i++){
            chars[i] = scan.next().charAt(0);
        }
        int result = Stringcompression(chars);
        System.out.println(Arrays.copyOf(chars, result));
    }
}