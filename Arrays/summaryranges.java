// 228. Summary Ranges
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class summaryranges{
    public static List<String> summary(int[] nums){
        if(nums.length == 0) return new ArrayList<>();
        if(nums.length == 1) {
            List<String> str = new ArrayList<>(Arrays.asList(String.valueOf(nums[0])));
            return str;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] + 1 == nums[i + 1]){
                arr.add(nums[i]);
            }
            else{
                arr.add(nums[i]);
                arr.add(9999999);
            }
        }
        arr.add(nums[nums.length - 1]);
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < arr.size()){
            if(arr.get(i) == 9999999){
                i++;
                continue;
            }

            int start = arr.get(i);
            int end = start;
            while(i + 1 < arr.size() && arr.get(i + 1) != 9999999){
                i++;
                end = arr.get(i);
            }
            if(start == end){
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        List<String> result = summary(nums);
        System.out.println(result);
    }
}