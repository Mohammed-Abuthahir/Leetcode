// 3827. Count Monobit Integers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class monobitInteger{
    public static int countMonobit(int n){
         int count = 0;
        for(int i = 0;i <= n ;i++){
            String binary = Integer.toBinaryString(i);
            boolean iscounting = false;
            for(int j = 0;j < binary.length() - 1;j++){
                if(binary.charAt(j) != binary.charAt(j + 1)){
                    iscounting = true;
                }
            }
            if(!iscounting){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = countMonobit(n);
        System.out.println(result);
    }
}