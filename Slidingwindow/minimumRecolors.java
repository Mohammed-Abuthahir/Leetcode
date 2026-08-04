// 2379. Minimum Recolors to Get K Consecutive Black Blocks
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class minimumRecolors{
    public static int minimumrecolors(String s, int k){
        int whitecolor = 0;
        for(int i = 0;i < k; i++){
            if(s.charAt(i) == 'W') whitecolor++;
        }
        int min = whitecolor;
        for(int i = k; i < s.length(); i++){
            if(s.charAt(i - k) == 'W'){
                whitecolor--;
            }
            if(s.charAt(i) == 'W'){
                whitecolor++;
            }
            min = Math.min(min, whitecolor);
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minimumrecolors(s, k);
        System.out.println(result);
    }
}