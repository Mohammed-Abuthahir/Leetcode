// 3477. Fruits Into Baskets II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numOfUnplacedFruits{
    public static int numOfUnplaced(int[] fruits, int[] baskets){
        int count = 0;
        for(int i = 0;i < fruits.length; i++){
            boolean enough = false;
            for(int j = 0; j < baskets.length; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;
                    enough = true;
                    break;
                }
            }
            if(enough) count++;
        }
        return (baskets.length - count);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Friuts Size : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the Baskets Size : ");
        int n2 = scan.nextInt();
        System.out.println("Enter the Friuts : ");
        int[] fruits = new int[n1];
        for(int i = 0;i < fruits.length; i++){
            fruits[i] = scan.nextInt();
        }
        System.out.println("Enter the Baskets : ");
        int[] baskets = new int[n2];
        for(int i = 0;i < baskets.length; i++){
            baskets[i] = scan.nextInt();
        }
        int result = numOfUnplaced(fruits, baskets);
        System.out.println(result);
    }
}