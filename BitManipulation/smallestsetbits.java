// 3370. Smallest Number With All Set Bits
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallestsetbits{
    public static int setbits(int n){
         int count = 0;
        for(int i = n; i < n + 600 ;i++) {
            String binary = Integer.toBinaryString(i);
            for(char c : binary.toCharArray()){
                if(c == '1'){
                    count++;
                    if(count == binary.length()) return Integer.parseInt(binary,2);
                }
            }
            count = 0;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Niumber :");
        int n = scan.nextInt();
        int result = setbits(n);
        System.out.println(result);
        
    }
}