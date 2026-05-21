// 2446. Determine if Two Events Have Conflict
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class haveConflict{
    public static boolean haveConflict(String[] event1 , String[] event2){
        return event1[0].compareTo(event2[1]) <= 0 && event2[0].compareTo(event1[1]) <= 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] event1 = new String[n1];
        for(int i = 0;i < event1.length; i++){
            event1[i] = scan.next();
        }
        System.out.println("Enter the Arrays 2");
        String[] event2 = new String[n2];
        for(int i = 0;i < event2.length;i++){
            event2[i] = scan.next();
        }
        boolean result = haveConflict(event1, event2);
        System.out.println(result);

    }
}