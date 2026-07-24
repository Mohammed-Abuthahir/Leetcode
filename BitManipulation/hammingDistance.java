// 461. Hamming Distance
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class hammingDistance{
    public static int hamming(int x, int y){
        StringBuilder num1 = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder num2 = new StringBuilder(Integer.toBinaryString(y));
        int width = Math.max(num1.length(), num2.length());
        while(num1.length() < num2.length()) num1.insert(0, "0");
        while(num2.length() < num1.length()) num2.insert(0, "0");
        int count = 0;
        for(int i = 0;i < num1.length(); i++){
            if(num1.charAt(i) != num2.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the X :");
        int x = scan.nextInt();
        System.out.println("Enter the Y :");
        int y = scan.nextInt();
        int result = hamming(x, y);
        System.out.println(result);
    }
}