// 868. Binary Gap
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class binaryGap{
    public static int binary(int n){
        String num = Integer.toBinaryString(n);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i < num.length();i++){
           if(num.charAt(i) == '1'){
               list.add(i);
           }
        }
        int max = 0;
        for(int i = 0;i < list.size() - 1;i++){
            max = Math.max(max,Math.abs(list.get(i) - list.get(i + 1)));
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = binary(n);
        System.out.println(result);
    }
}