// 942. DI String Match
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class diStringMatch{
    public static int[] diString(String s){
        int n = s.length();
        int[] perm = new int[n + 1];
        int low = 0; int high = n;
        for(int i = 0;i < n; i++){
            if(s.charAt(i) == 'I'){
                perm[i] = low;
                low++;
            }
            else{
                perm[i] = high;
                high--;
            }
        }
        perm[n] = low;
        return perm;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        int[] result = diString(s);
        System.out.println(Arrays.toString(result));
    }
}