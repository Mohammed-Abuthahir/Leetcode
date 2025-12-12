import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class DisappearedinanArray{
    public static ArrayList<Integer> missing(int[] nums){
         HashSet<Integer>set = new HashSet<>();
        for(int i = 1;i<=nums.length;i++){
            set.add(i);
        }
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] nums = {1,1,2};
        ArrayList<Integer> result = missing(nums);
        System.out.println("Disapper number is :"+result);
    }
}
// doubttttttt summm 