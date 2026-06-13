import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class threeConsecutiveInteger{
    public static long[] sumOfThree(long num){
        if(num % 3 != 0) return new long[]{};
        long x = num / 3;
        return new long[] {x - 1, x , x + 1};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Num :");
        long num = scan.nextLong();
        long[] result = sumOfThree(num);
        System.out.println(Arrays.toString(result));
    }
}