// 3295. Report Spam Message
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reportSpam{
    public static boolean reportSpam(String[] message, String[] bannedWords){
        HashSet<String> nums = new HashSet<>();
        for(String word : bannedWords) nums.add(word);
        int count = 0;
        for(String word : message){
            if(nums.contains(word)) count++;
            if(count == 2) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 : ");
        int n2 = scan.nextInt();
        scan.nextLine(); 
        System.out.println("Enter the Message Array Elements :");
        String[] message = new String[n1];
        for (int i = 0; i < message.length; i++) {
            message[i] = scan.nextLine();
        }
        System.out.println("Enter the Banned Words Array Elements :");
        String[] bannedWords = new String[n2];
        for (int i = 0; i < bannedWords.length; i++) {
            bannedWords[i] = scan.next(); 
        }
        boolean result = reportSpam(message, bannedWords);
        System.out.println(result);
    }
}