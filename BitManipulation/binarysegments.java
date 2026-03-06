// 1784. Check if Binary String Has at Most One Segment of Ones
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class binarysegments{
    public static boolean binary(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }
        int checkcount = 0;
        for(int c : s.toCharArray()){
            if(c == '1'){
                checkcount++;
            }
            else{
                break;
            }
        }
        return count == checkcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = binary(s);
        System.out.println(result);
    }
}