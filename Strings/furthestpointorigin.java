// 2833. Furthest Point From Origin
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class furthestpointorigin{
    public static int furthestDistanceFromOrigin(String s){
        int Lcount = 0; int Rcount = 0; int Undercount = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'L') Lcount++;
            else if(ch == 'R') Rcount++;
            else Undercount++;
        }
        int totright = Rcount + Undercount;
        int totleft = Lcount + Undercount;
        int max = 0;
        max = Math.max(max , totright - Lcount);
        max = Math.max(max, totleft - Rcount);
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = furthestDistanceFromOrigin(s);
        System.out.print(result);
    }
}