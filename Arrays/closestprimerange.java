// 2523. Closest Prime Numbers in Range
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class closestprimerange{
    public static boolean isprime(int num){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] closestPrimes(int left,int right){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left;i <= right;i++){
            if(isprime(i)){
                list.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < list.size() - 1;i++){
            min = Math.min(min,Math.abs((list.get(i) - list.get(i + 1))));
        }
        for(int i = 0;i < list.size() - 1;i++){
            if(min == Math.abs(list.get(i) - list.get(i + 1))){
                return new int[]{list.get(i),list.get(i + 1)};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Left :");
        int left = scan.nextInt();
        System.out.println("Enter the Right :");
        int right = scan.nextInt();
        int[] result = closestPrimes(left , right);
        System.out.println(Arrays.toString(result));
    }
}