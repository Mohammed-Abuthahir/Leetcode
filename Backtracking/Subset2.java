// 90. Subsets II
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Subset2{
    public static void getSubset(LinkedHashSet<List<Integer>> list, ArrayList<Integer> arr, int[] nums, int st){
        list.add(new ArrayList<>(arr));
        for(int i = st;i < nums.length;i++){
            arr.add(nums[i]);
            getSubset(list,arr,nums,i + 1);
            arr.remove(arr.size() - 1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        LinkedHashSet<List<Integer>> list = new LinkedHashSet<>();
        getSubset(list,new ArrayList<>(),nums,0);
        return new ArrayList<>(list);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
}