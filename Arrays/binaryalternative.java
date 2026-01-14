// 693. Binary Number with Alternating Bits
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class binaryalternative{
    public static boolean alternative(int num){
          String binary = Integer.toBinaryString(num);
            for(int i = 0; i < binary.length() - 1; i++){
                if(binary.charAt(i) == binary.charAt(i + 1)){
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the Number :");
        int n = scan.nextInt();
        boolean result = alternative(n);
        System.out.println(result);
    }
}