// 3516. Find Closest Person
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findClosest{
    public static int findclosest(int x, int y, int z){
        int num1 = 0; int num2 = 0;
        if(x > z) num1 = x - z;
        else num1 = z - x;
        if(y > z) num2 = y - z;
        else num2 = z - y;
        if(num1 == num2) return 0;
        return num1 < num2 ? 1 : 2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x :");
        int x = scan.nextInt();
        System.out.println("Enter the y : ");
        int y = scan.nextInt();
        System.out.println("Enter the Z :");
        int z = scan.nextInt();
        int result = findclosest(x, y, z);
        System.out.println(result);
    }
}