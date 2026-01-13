import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class WeakestRows{
    public static int[] weakestmat(int[][] nums,int k){
        int[] arr = new int[nums.length];
            int m = 0;
            for(int i = 0;i<nums.length;i++){
                int sum = 0;
                for(int j = 0;j<nums[i].length;j++){
                    sum = sum + nums[i][j];
                }
                arr[m++] =  sum;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i < arr.length;i++){
                map.put(i,arr[i]);
            }
            ArrayList<Integer>list = new ArrayList<>(map.keySet());
            Collections.sort(list,(a,b) -> {
                if(map.get(a) != map.get(b)){
                    return map.get(a) - map.get(b);
                }
                else{
                    return a - b;
                }
            });
        int[] ans = new int[k];
        int index = 0;
        for(int i = 0; i < k;i++){
            ans[i] = list.get(index++);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the col :");
        int col = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][col];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int[] result = weakestmat(nums,k);
        System.out.println("result :"+Arrays.toString(result));

    }
}