// 2578. Split With Minimum Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class splitNum{
    public static int splitNum(int num){
        List<Integer> digits = new ArrayList<>();
        while(num > 0){
            digits.add(num % 10);
            num = num / 10;
        }
        Collections.sort(digits);
        int num1 = 0; int num2 = 0;
        for(int i = 0;i < digits.size(); i++){
            if(i % 2 == 0){
                num1 = num1 * 10 + digits.get(i);
            }
            else{
                num2 = num2 * 10 + digits.get(i);
            }
        }
        return num1 + num2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scan.nextInt();
        int result = splitNum(num);
        System.out.println(result);
    }
}