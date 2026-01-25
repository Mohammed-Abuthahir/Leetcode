// 2906. Construct Product Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class productexceptcellmat{
    public static int[][] product(int[][] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                list.add(nums[i][j]);
            }
        }
        int[] prefix = new int[list.size()];
        int[] suffix = new int[list.size()];
        prefix[0] = 1;
        suffix[suffix.length - 1] = 1;
        for(int i = 1;i < list.size();i++){
            prefix[i] = (int)((long) prefix[i - 1] * list.get(i - 1) % 12345);
        }
        for(int i = list.size() - 2;i >= 0;i--){
            suffix[i] = (int)((long)suffix[i + 1] * list.get(i + 1) % 12345);
        }
        for(int i = 0;i < list.size();i++){
            list.set(i,(int) ((long)prefix[i] * suffix[i] % 12345));
        }
        int index = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j <nums[i].length;j++){
                nums[i][j] = list.get(index++);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row");
        int row = scan.nextInt();
        System.out.println("Enter the Cols");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[][] result = product(nums);
        System.out.println(Arrays.deepToString(result));
    }
}