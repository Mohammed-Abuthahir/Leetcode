// 1684. Count the Number of Consistent Strings
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class consistentstring{
    public static int countingString(String allowed,String[] nums){
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0;i < allowed.length();i++){
            list.add(allowed.charAt(i));
        }
        int count = 0;
        int realcount = 0;
        for(String word : nums){
            for(char ch : word.toCharArray())
                if(list.contains(ch)){
                    count++;
                    if(count == word.length()){
                        realcount++;
                    }
                }
            count = 0;
        }
        return realcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String allowed = scan.next();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array ;");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        int result = countingString(allowed,nums);
        System.out.println(result);
    }
}