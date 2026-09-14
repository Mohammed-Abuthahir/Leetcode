// 836. Rectangle Overlap
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class isRectangleOverlap{
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2){
        return (rec1[2] > rec2[0] && rec1[3] > rec2[1] && rec1[0] < rec2[2] && rec1[1] < rec2[3]);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the rec 1 : ");
        int[] rec1 = new int[n1];
        for(int i = 0;i < rec1.length; i++){
            rec1[i] = scan.nextInt();
        }
        System.out.println("Enter the rec 2 : ");
        int[] rec2 = new int[n2];
        for(int i = 0;i < rec2.length; i++){
            rec2[i] = scan.nextInt();
        }
        boolean result = isRectangleOverlap(rec1, rec2);
        System.out.println(result);
    
    }
}