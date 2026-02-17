// 1492. The kth Factor of n
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kthfactor{
    public static int kfactor(int n,int k){
        int factor = 0;
        for(int i = 1;i <= n;i++){
            if(n % i == 0){
                k--;
                if(k == 0){
                    factor = i;
                    break;
                }
            }
        }
        return factor;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = kfactor(n,k);
        System.out.println("Kth Factor :"+result);
    }
}