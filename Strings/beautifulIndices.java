// 3006. Find Beautiful Indices in the Given Array I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class beautifullIndices{
    public static List<Integer> beatifullindices(String s, String a, String b, int k){
       List<Integer> aoccurance = new ArrayList<>();
        List<Integer> boccurance = new ArrayList<>();
        for (int i = 0; i <= s.length() - a.length(); i++) {
            if (s.substring(i, i + a.length()).equals(a)) {
                aoccurance.add(i);
            }
        }

        for (int i = 0; i <= s.length() - b.length(); i++) {
            if (s.substring(i, i + b.length()).equals(b)) {
                boccurance.add(i);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num : aoccurance){
            for(int num1 : boccurance){
                    if(Math.abs(num - num1) <= k){
                    list.add(num);
                    break;
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the String :");
        String a = scan.next();
        System.out.println("Enter the String :");
        String b = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        List<Integer> result = beatifullindices(s, a, b, k);
        System.out.println(result);

    }
}