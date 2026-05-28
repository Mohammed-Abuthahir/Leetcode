// 3168. Minimum Number of Chairs in a Waiting Room
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumChairs{
    public static int minimumchairs(String s){
        int count = 0;
        int max = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                count--;
            }
            else{
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = minimumchairs(s);
        System.out.println(result);
    }
}