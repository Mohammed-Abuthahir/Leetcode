// 383. Ransom Note
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ransomNote{
    public static boolean canConstruct(String ransom,String magazine){
        ArrayList<Character> list = new ArrayList<>();
        for(char c : magazine.toCharArray()){
            list.add(c);
        }
        for(char c : ransom.toCharArray() ){
            if(list.contains(c)){
                list.remove(Character.valueOf(c));
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the RansomNote :");
        String ransom = scan.nextLine();
        System.out.println("Enter the magazine :");
        String magazine = scan.nextLine();
        boolean result = canConstruct(ransom,magazine);
        System.out.println(result);
    }
}