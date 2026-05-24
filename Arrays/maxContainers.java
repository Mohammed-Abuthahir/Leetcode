// 3492. Maximum Containers on a Ship
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxContainers{
    public static int maxcontainer(int n, int w, int maxWeight){
        int n1 = (int) Math.pow(n, 2);
        int totweight = n1 * w;
        if(maxWeight > totweight){
            return totweight / w;
        }
        return maxWeight / w;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the n :");
        int n = scan.nextInt();
        System.out.println("Enter the W :");
        int w = scan.nextInt();
        System.out.println("Enter the maxWeight :");
        int maxWeight = scan.nextInt();
        int result = maxcontainer(n, w, maxWeight);
        System.out.println(result);
    }
}