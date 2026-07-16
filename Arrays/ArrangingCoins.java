// 441. Arranging Coins
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ArrangingCoins{
    public static int arrangecoins(int n){
        int temp = n; 
        int count = 0;
        for(int i = 1;i <= n; i++){
            if(temp > i){
                temp = temp - i;
                count++;
            }
            else if(temp == i){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = arrangecoins(n);
        System.out.println(result);
    }
}