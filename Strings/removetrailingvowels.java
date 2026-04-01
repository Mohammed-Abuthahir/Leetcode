// 3856. Trim Trailing Vowels
import java.util.Scanner;

class removetrailingvowels {
    public static boolean isVowel(char c) {
        // Added toLowerCase to handle "IDEA" or "Idea"
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }

    public static String vowel(String s) {
        int i = s.length() - 1;
        while (i >= 0 && isVowel(s.charAt(i))) {
            i--;
        }
        return s.substring(0, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = scan.nextLine();
        String result = vowel(s);
        System.out.println(result);
    }
}