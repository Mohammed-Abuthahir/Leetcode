// 43. Multiply Strings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class multiplyString{
    public static String multiply(String num1,String num2){
        int n = num1.length();
        int m = num2.length();
        if(num1.equals("0") || num2.equals("0")) return "0";
        int[] res = new int[n + m];
        for(int i = n - 1 ;i >= 0;i--){
            for(int j = m - 1;j >= 0;j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] = sum / 10;
            }
        }
        StringBuilder s = new StringBuilder();
        for(int num : res){
            if(!(s.isEmpty() && num == 0)){
                s.append(num);
            }
        }
        return s.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Num1 :");
        String num1 = scan.nextLine();
        System.out.println("Enter the Num2 :");
        String num2 = scan.nextLine();
        String result = multiply(num1,num2);
        System.out.println(result);
    }
}