// 1009. Complement of Base 10 Integer
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class base10{
    public static int compliment(int num){
        String binary = Integer.toBinaryString(num);
        String s = "";
        for(int i = 0;i < binary.length();i++){
            if(binary.charAt(i) == '0'){
                s = s + '1';
            }
            else{
                s = s + '0';
            }
        }
        return Integer.parseInt(s,2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = compliment(n);
        System.out.println("result :"+result);
    }
}