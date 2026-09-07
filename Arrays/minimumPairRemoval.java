// 3507. Minimum Pair Removal to Sort Array I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumPairRemoval{
    public static int minimumPairRemoval(int[] nums){
        boolean initialSorted = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                initialSorted = false;
                break;
            }
        }
        if (initialSorted) return 0;
        int realcount = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);
        while (true) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < list.size() - 1; i++) {
                min = Math.min(min, list.get(i) + list.get(i + 1));
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if (min == (list.get(i) + list.get(i + 1))) {
                    list.set(i, list.get(i) + list.get(i + 1));
                    list.remove(i + 1);
                    break;
                }
            }
            boolean sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    sorted = false;
                }
            }
            realcount++;
            if(sorted) break;
        }
        return realcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = minimumPairRemoval(nums);
        System.out.println(result);
    }
}