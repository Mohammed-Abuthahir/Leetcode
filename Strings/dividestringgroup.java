// 2138. Divide a String Into Groups of Size k
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class dividestringgroup{
    public static String[] dividestring(String s ,int k,char fill){
        while(s.length() % k != 0){
            s = s + fill;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i < s.length();i = i + k){
            list.add(s.substring(i , i + k));
        }
        String[] nums = new String[list.size()];
        int i = 0;
        for(String str : list){
            nums[i++] = str;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the k :");
        int k = scan.nextInt();
        System.out.println("Enter the char");
        char fill = 'x';
        String[] result = dividestring(s,k,fill);
        System.out.println(Arrays.toString(result));

    }
}