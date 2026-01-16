// 412. Fizz Buzz
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FizzBuzz{
    public static List<String> fizzbuzz(int n){
        ArrayList<String > nums = new ArrayList<>();
       for(int i = 1;i <= n;i++){
           if(i % 3 == 0 && i % 5 == 0){
               nums.add("FizzBuzz");
           }
           else if(i % 3 == 0){
               nums.add("Fizz");
           }
           else if(i % 5 == 0){
               nums.add("Buzz");
           }
           else{
               nums.add(String.valueOf(i));
           }
       }
       return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        List<String> result = fizzbuzz(num);
        System.out.println("Result :"+result);
    }
}