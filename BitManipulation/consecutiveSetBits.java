// 3950. Exactly One Consecutive Set Bits Pair
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class consecutiveSetBits{
    public static boolean consecutive(int n){
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0;i < binary.length() - 1; i++){
            if(binary.charAt(i) == '1' && binary.charAt(i + 1) == '1'){
                count++;
            }
        }
        return count == 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        boolean result = consecutive(n);
        System.out.println(result);
    }
}