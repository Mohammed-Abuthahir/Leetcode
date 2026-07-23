// 1160. Find Words That Can Be Formed by Characters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countCharacter{
    public static int countchars(String[] nums, String chars){
        ArrayList<Character> list = new ArrayList<>();
        for(char c : chars.toCharArray()) list.add(c);
        int sum = 0;
        for(String num : nums){
            boolean istrue = true;
            for(char c : num.toCharArray()){
                if(list.contains(c)) list.remove(Character.valueOf(c));
                else{
                    istrue = false;
                    break;
                }
            }
            if(istrue) sum = sum + num.length();
            list.clear();
            for(char c : chars.toCharArray()) list.add(c);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        System.out.println("Enter the Chars :");
        String chars = scan.next();
        int result = countchars(nums, chars);
        System.out.println(result);
    }
}