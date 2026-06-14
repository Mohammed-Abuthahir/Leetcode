// 1006. Clumsy Factorial
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ClumsyFactorial{
    public static int clumsyfact(int num){
        Stack<Integer> stack = new Stack<>();
        stack.push(num);
        int idx = 0;
        for(int i = num - 1; i >= 1; i--){
            switch(idx){
                case 0:
                    stack.push(stack.pop() * i);
                    break;
                case 1:  
                    stack.push(stack.pop() / i);
                    break;
                case 2 :
                    stack.push(i);
                    break;
                case 3 :
                    stack.push(-i);
                    break;
            }
            idx = (idx + 1) % 4;
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum = sum + stack.pop();
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = clumsyfact(num);
        System.out.println(result);
    }
}