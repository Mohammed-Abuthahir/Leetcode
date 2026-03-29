// 1880. Check if Word Equals Summation of Two Words
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Stringequals{
    public static boolean isSumEqual(String first, String second, String target){
        HashMap<Character,Integer> map = new HashMap<>();
        int idx = 0;
        for(int i = 97;i <= 122; i++){
            map.put((char) i, idx++);
        }
        StringBuilder firstNum = new StringBuilder();
        StringBuilder secondNum = new StringBuilder();
        StringBuilder targetNum = new StringBuilder();
        for(char c : first.toCharArray()){
            firstNum.append(map.get(c));
        }
        for(char c : second.toCharArray()){
            secondNum.append(map.get(c));
        }
        for(char c : target.toCharArray()){
            targetNum.append(map.get(c));
        }
        return Integer.parseInt(firstNum.toString()) + Integer.parseInt(secondNum.toString()) == Integer.parseInt(targetNum.toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First :");
        String firstword = scan.next();
        System.out.println("Enter the Second :");
        String secondword = scan.next();
        System.out.println("Enter the Target :");
        String targetword = scan.next();
        boolean result = isSumEqual(firstword,secondword,targetword);
        System.out.println(result);
    }
}