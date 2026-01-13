// 509. Fibonacci Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FibonacciNumber{
    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }
        int a = -1;
        int b = 1;
        int c;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0;i <= num;i++){
            c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        return list.get(num - 1) + list.get(num - 2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int num = scan.nextInt();
        int result = fibonacci(num);
        System.out.println("Fibonacci Number :"+result);
    }
}