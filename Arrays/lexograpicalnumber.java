// 386. Lexicographical Numbers
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class lexograpicalnumber{
    public static ArrayList<Integer> lexoorder(int nums){
         ArrayList<String>list = new ArrayList<>();
        int i = 1;
        while(i <= nums){
            list.add(String.valueOf(i));
            i++;
        }
        Collections.sort(list);
        ArrayList<Integer> arr = new ArrayList<>();
        for(String num : list){
            arr.add(Integer.parseInt(num));
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        ArrayList<Integer> result = lexoorder(n);
        System.out.println(result);
    }
}