// 1304. Find N Unique Integers Sum up to Zero
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class uniqueInteger{
    public static int[] Integer(int n){
        int[] arr = new int[n];
        int index = 0;
        for(int i = 1; i <= n / 2;i++){
            arr[index++] = i;
            arr[index++] = -i;
        }
        if(n % 2 == 1){
            arr[index] = 0;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int[] result = Integer(n);
        System.out.println(Arrays.toString(result));
    }
}