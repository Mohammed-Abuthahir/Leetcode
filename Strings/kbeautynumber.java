// 2269. Find the K-Beauty of a Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kbeautynumber{
    public static int kbeauty(int num,int k){
        String s = String.valueOf(num);
        int count = 0;
        for(int i = 0;i <= s.length() - k; i++){
            String sub = s.substring(i , i + k);
            if(Integer.parseInt(sub) != 0){
                if(num % Integer.parseInt(sub) == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = kbeauty(num , k);
        System.out.println(result);
    }
}