// 4084. Last Visited Cell in a Directional Grid
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class lastVisitedCell{
    public static int[] lastvisited(char[][] nums){
        int row = 0;
        int col = 0;
        int lastrow = 0;
        int lastcol = 0;
        while(row >= 0 && row < nums.length && col >= 0 && col < nums[0].length && nums[row][col] != (char) -1){
            lastrow = row;
            lastcol = col;
            char direction = nums[row][col];
            nums[row][col] = (char) -1;
            if(direction == 'R') col++;
            else if(direction == 'L') col--;
            else if(direction == 'U') row--;
            else row++;
        }
        return new int[] {lastrow, lastcol};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the cols : ");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        char[][] nums = new char[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.next().charAt(0);
            }
        }
        int[]  result = lastvisited(nums);
        System.out.println(Arrays.toString(result));
    }
}