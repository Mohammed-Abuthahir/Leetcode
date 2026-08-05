// 3210. Find the Encrypted String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class getEncryptedString{
    public static String getencrypted(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length(); i++){
            char c = s.charAt((i + k) % s.length());
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strinng :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = getencrypted(s, k);
        System.out.print("After Encryption : "+result);
    }
}