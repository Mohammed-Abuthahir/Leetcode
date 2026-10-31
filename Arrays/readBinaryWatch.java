// 401. Binary Watch
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class readBinaryWatch{
    public static List<String> readBinaryWatch(int turnOn){
        List<String> nums = new ArrayList<>();
        for(int i = 0;i <= 11; i++){
            for(int j = 0;j <= 59; j++){
                int num1 = Integer.bitCount(i);
                int num2 = Integer.bitCount(j);
                if((num1 + num2) == turnOn){
                    if(j <= 9){
                        nums.add(i + ":0" + j);
                    }
                    else nums.add(i + ":" + j);
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the TurnOn : ");
        int turnOn = scan.nextInt();
        List<String> result = readBinaryWatch(turnOn);
        System.out.println(result);
    }
}