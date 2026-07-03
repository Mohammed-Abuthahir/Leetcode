// 1128. Number of Equivalent Domino Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class dominopairs{
    public static int numEquivDominoPairs(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i][0] == nums[j][0] && nums[i][1] == nums[j][1]) ||
                    (nums[i][0] == nums[j][1] && nums[i][1] == nums[j][0])) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        int[][] nums = new int[row][cols];
        System.out.println("Enter the Arrays :");
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = numEquivDominoPairs(nums);
        System.out.println(result);
    }
}