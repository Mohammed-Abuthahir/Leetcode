// 2913. Subarrays Distinct Element Sum of Squares I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sumCounts{
    public static int sumcounts(List<Integer> nums){
        int sum = 0;
        for(int i = 0;i < nums.size(); i++){
            for(int j = i; j < nums.size(); j++){
                HashSet<Integer> set = new HashSet<>();
                for(int k = i; k <= j; k++){
                    set.add(nums.get(k));
                }
                sum = sum + (set.size() * set.size());
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,1));
        int result = sumcounts(nums);
        System.out.println(result);
    }
}