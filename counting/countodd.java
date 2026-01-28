import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countodd{
    public static int countingodds(int low ,int high){
        int oddcount = 0;
        while(low <= high){
            if((low & 1) == 1){
                oddcount++;
                low++;
            }
            low++;
        }
        return oddcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the Low :");
        int low = scan.nextInt();
        System.out.println("Enter the High :");
        int high = scan.nextInt();
        int result = countingodds(low,high);
        System.out.println("Count of Odd Number :"+result);
    }
}