// 191. Number of 1 Bits
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numberonebits{
    public static int hammingWeight(int num) {
        String binary = Integer.toBinaryString(num);
        int count = 0;
        for(int i = 0;i < binary.length();i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = hammingWeight(n);
        System.out.println("Number Once is :"+result);
    }
}
