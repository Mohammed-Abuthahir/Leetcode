// 1869. Longer Contiguous Segments of Ones than Zeros
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class checkZeroOnes{
    public static boolean checkzeronce(String s){
        int onecount = 0;
        int zerocount = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == '1'){
                onecount++;
                max1 = Math.max(max1, onecount);
            }
            else{
                onecount = 0;
            }
        }
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zerocount++;
                max2 = Math.max(max2 , zerocount);
            }
            else{
                zerocount = 0;
            }
        }
        return max1 > max2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = checkzeronce(s);
        System.out.println(result);
    }
}