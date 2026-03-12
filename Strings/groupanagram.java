// 49 - group anagrams
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class groupanagram{
    public static List<List<String>> GroupingAnagram(String[] nums){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : nums){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s1 = String.valueOf(arr);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i <  nums.length;i++){
            nums[i] = scan.next();
        }
        List<List<String>> result = GroupingAnagram(nums);
        System.out.println(result);
    }
}