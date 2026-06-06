// 3945. Digit Frequency Score
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class digitFrequencyScore{
    public static int digitfrequencyscore(int num){
         ArrayList<Integer> list = new ArrayList<>();
        while(num > 0){
            int rem = num % 10;
            list.add(rem);
            num = num / 10;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        int sum = 0;
        for(int num1 : map.keySet()){
            sum = sum + (num1 * map.get(num1));
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the Number :");
        int n = scan.nextInt();
        int result = digitfrequencyscore(n);
        System.out.println(result);
    }
}