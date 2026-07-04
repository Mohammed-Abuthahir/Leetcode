// 2278. Percentage of Letter in String
import java.util.*;
class percentageofLetter{
    public static int percentage(String s, char letter) {
       int count = 0;

        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }

        return (count * 100) / s.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = percentage(s);
        System.out.println(result);
    }
}