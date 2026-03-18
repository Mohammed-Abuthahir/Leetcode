// 566. Reshape the Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reshapmatrix{
    public static int[][] reshape(int[][] nums,int r,int c){
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                list.add(nums[i][j]);
                count++;
            }
        }
        int[][] newArr = new int[r][c];
        if(count == r * c){
            int k = 0;
            for(int i = 0;i < newArr.length;i++){
                for(int j = 0;j < newArr[i].length;j++){
                    newArr[i][j] = list.get(k++);
                }
             }
        }
        return count == r * c ? newArr : nums;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the R :");
        int r = scan.nextInt();
        System.out.println("Enter the C :");
        int c = scan.nextInt();
        int[][] result = reshape(nums,r,c);
        System.out.println(Arrays.deepToString(result));
    }
}