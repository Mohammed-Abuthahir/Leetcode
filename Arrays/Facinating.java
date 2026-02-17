// 2729. Check if The Number is Fascinating
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Facinating{
    public static boolean facinate(int n){
       int n1 = 2 * n;
       int n2 = 3 * n;
       String num = String.valueOf(n);
       String num1 = String.valueOf(n1);
       String num2 = String.valueOf(n2);
       HashSet<Integer> list = new HashSet<>();
       for(int i = 0;i < num.length();i++){
           list.add(num.charAt(i)-'0');
           list.add(num1.charAt(i)-'0');
           list.add(num2.charAt(i) - '0');
       }
       for(int i = 1;i <= 9;i++){
           if(!list.contains(i)){
               return false;
           }
       }
       return true;   
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        boolean result = facinate(n);
        System.out.println(result);
    }
}