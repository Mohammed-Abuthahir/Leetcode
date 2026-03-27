// 2586. Count the Number of Vowel Strings in Range
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countvowelrange{
    public static int countvowel(String[] words1,int left,int right){
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('u');
        set.add('o');
        int count = 0;
        while (left <= right) {
            String currentWord = words1[left];
            if (currentWord.length() > 0) {
                char firstChar = currentWord.charAt(0);
                char lastChar = currentWord.charAt(currentWord.length() - 1);
                if (set.contains(firstChar) && set.contains(lastChar)) {
                    count++;
                }
            }
            left++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] words1 = new String[n1];
        for(int i = 0;i < words1.length;i++){
            words1[i] = scan.next();
        }
        System.out.println("Enter the Left :");
        int left = scan.nextInt();
        System.out.println("Enter the Right :");
        int right = scan.nextInt();
        int result = countvowel(words1,left,right);
        System.out.println(result);
    }
}