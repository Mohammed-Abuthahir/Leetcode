// 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class modifyString{
    public static String modifyString(String str){
        if(str.length() == 1) return "a";
        List<Character> arr = new ArrayList<>();
        for(int i = 97; i <= 122; i++){
            arr.add((char) i);
        }
        char[] nums = str.toCharArray();
        for(int i = 0;i < nums.length - 1; i++){
            if(nums[i] == '?' && i == 0){
                for(int j = 0;j < arr.size(); j++){
                    if(nums[i + 1] != arr.get(j)){
                        nums[i] = arr.get(j);
                    }
                }
            }
            else if(nums[i] == '?'){
                for(int j = 0; j < arr.size(); j++){
                    if(nums[i + 1] != arr.get(j) && nums[i - 1] != arr.get(j)){
                         nums[i] = arr.get(j);
                    }
                }
            }
        }
        if(nums[nums.length - 1] == '?'){
            for(int i = 0;i < arr.size(); i++){
            if(nums[(nums.length - 1) - 1] != arr.get(i)){
                nums[nums.length - 1] = arr.get(i);
                break;
                }
            }
        }
        return new String(nums);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.next();
        String result = modifyString(str);
        System.out.println(result);
    }
}