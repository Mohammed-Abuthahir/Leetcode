// 3318. Find X-Sum of All K-Long Subarrays I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findXsum{
    public static int[] findsumOfX(int[] nums, int k, int x){
       int index = 0;
        int[] ans = new int[nums.length - k + 1];
        for(int i = 0;i <= nums.length - k; i++){
            int[] arr = Arrays.copyOfRange(nums, i, i + k);
            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                        if (!map.get(a).equals(map.get(b))) {
                            return map.get(b) - map.get(a);
                        }
                        return b - a;
                    }
            );
            for(int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
            pq.addAll(map.keySet());
            int idx = 0;  int sum = 0;
            while (!pq.isEmpty() && idx < x) {
                int value = pq.poll();
                for(int m = 0; m < map.get(value); m++)  sum = sum + value;
                idx++;
            }
            ans[index++] = sum;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K : ");
        int k = scan.nextInt();
        System.out.println("Enter the X : ");
        int x = scan.nextInt();
        int[] result = findsumOfX(nums, k, x);
        System.out.println(Arrays.toString(result));
    }
}