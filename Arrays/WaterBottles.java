// 1518. Water Bottles
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class WaterBottles{
    public static int numWater(int num, int exchange){
        int sum = num;
        while(num >= exchange){
            sum = sum + (num / exchange);
            num = (num / exchange) + (num % exchange);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        System.out.println("Enter the exchange : ");
        int exchange = scan.nextInt();
        int result = numWater(n, exchange);
        System.out.println(result);
    }
}
