import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Lengthoflastword{
    public static int lengthoflast(String s){
        int length = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                return length;
            }
            else{
                length++;
            }
        }
        return length;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Long String :");
        String s = scan.nextLine();
        int result = lengthoflast(s);
        System.out.println("Length of Last Word :"+result);
    }
}