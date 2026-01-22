// 1796. Second Largest Digit in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class secondlargedigit{
    public static int secontlarge(String s){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                set.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        int secondMax = -1;
        if(set.size() == 0 || set.size() == 1){
            return -1;
        }
        else{
            secondMax = Collections.max(set);
            set.remove(secondMax);
            secondMax = Collections.max(set);
        }
        return secondMax;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = secontlarge(s);
        System.out.println("result :" + result);
    }
}