// 1886. Determine Whether Matrix Can Be Obtained By Rotation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MatrixRotation{
    public static boolean matrixrotation(int[][] nums,int[][] target){
         boolean issecond = false;
            boolean isthird = false;
            boolean isfour = false;
            for(int i = 0;i < nums.length;i++){
                for(int j = i;j < nums[i].length;j++){
                    int temp = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = temp;
                }
            }
            for(int i = 0;i < nums.length;i++){
                int left = 0;
                int right = nums[i].length - 1;
                while(left <= right){
                    int temp = nums[i][left];
                    nums[i][left] = nums[i][right];
                    nums[i][right] = temp;
                    left++;
                    right--;
                }
            }
            int count = 0;
            for(int i = 0;i < target.length;i++){
                for(int j = 0;j < target[i].length;j++){
                    if(nums[i][j] != target[i][j]){
                        issecond = true;
                    }
                }
            }
            if(issecond){
                for(int i = 0;i < nums.length;i++){
                    for(int j = i;j < nums[i].length;j++){
                        int temp = nums[i][j];
                        nums[i][j] = nums[j][i];
                        nums[j][i] = temp;
                    }
                }
                for(int i = 0;i < nums.length;i++){
                    int left = 0;
                    int right = nums[i].length - 1;
                    while(left <= right){
                        int temp = nums[i][left];
                        nums[i][left] = nums[i][right];
                        nums[i][right] = temp;
                        left++;
                        right--;
                    }
                }
                for(int i = 0;i < target.length;i++){
                    for(int j = 0;j < target[i].length;j++){
                        if(nums[i][j] != target[i][j]){
                            isthird = true;
                        }
                    }
                }
            }
        if(isthird){
            for(int i = 0;i < nums.length;i++){
                for(int j = i;j < nums[i].length;j++){
                    int temp = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = temp;
                }
            }
            for(int i = 0;i < nums.length;i++){
                int left = 0;
                int right = nums[i].length - 1;
                while(left <= right){
                    int temp = nums[i][left];
                    nums[i][left] = nums[i][right];
                    nums[i][right] = temp;
                    left++;
                    right--;
                }
            }
            for(int i = 0;i < target.length;i++){
                for(int j = 0;j < target[i].length;j++){
                    if(nums[i][j] != target[i][j]){
                        isfour = true;
                    }
                }
            }
        }
        if(isfour){
            for(int i = 0;i < nums.length;i++){
                for(int j = i;j < nums[i].length;j++){
                    int temp = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = temp;
                }
            }
            for(int i = 0;i < nums.length;i++){
                int left = 0;
                int right = nums[i].length - 1;
                while(left <= right){
                    int temp = nums[i][left];
                    nums[i][left] = nums[i][right];
                    nums[i][right] = temp;
                    left++;
                    right--;
                }
            }
            for(int i = 0;i < target.length;i++){
                for(int j = 0;j < target[i].length;j++){
                    if(nums[i][j] != target[i][j]){
                        return false;
                    }
                }
            }
        }
       return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Target Row :");
        int row1 = scan.nextInt();
        System.out.println("Enter the Target Cols :");
        int cols1 = scan.nextInt();
        System.out.println("Enter the Target :");
        int[][] target = new int[row1][cols1];
        for(int i = 0;i < target.length;i++){
            for(int j = 0;j < target[i].length;j++){
                target[i][j] = scan.nextInt();
            }
        }
        boolean result = matrixrotation(nums,target);
        System.out.println(result);
    }
}