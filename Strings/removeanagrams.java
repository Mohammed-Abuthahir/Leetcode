// 2273. Find Resultant Array After Removing Anagrams
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeanagrams{

    public static List<String> Anagrams(String[] nums){
        ArrayList<String> result = new ArrayList<>();
        result.add(nums[0]);
        for(int i = 1;i < nums.length;i++){
            char[] current = nums[i].toCharArray();
            Arrays.sort(current);
            String s1 = new String(current);
            char[] prev = nums[i - 1].toCharArray();
            Arrays.sort(prev);
            String s2 = new String(prev);
            if(!s1.equals(s2)){
                result.add(nums[i]);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        List<String> result = Anagrams(nums);
        System.out.println(result);
    }
}