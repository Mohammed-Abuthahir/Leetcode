// 1572. Matrix Diagonal Sum
import java.util.*;
import java.util.Arrays;
class diagonalsum{
    public static int diagonalSum(int[][] nums){
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + nums[i][i] + nums[i][nums.length - 1 - i];
        }
        ArrayList<Integer> center = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            center.add(nums[i][i]);
        }
        if(center.size() % 2 == 0){
            return sum;
        }
        sum = sum - center.get(center.size() / 2);
        return sum;
    }
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = diagonalSum(nums);
        System.out.println("diagonal Sum is :"+result);
    }
}