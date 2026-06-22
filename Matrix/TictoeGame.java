// 1275. Find Winner on a Tic Tac Toe Game
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class TictoeGame{
    public static String tictactoe(int[][] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i < nums.length ; i++){
            for(int j = 0;j < nums[i].length; j++){
                arr.add(nums[i][j]);
            }
        }
        char[][] newArr = new char[3][3];
        for(int i = 0;i < newArr.length; i++){
            Arrays.fill(newArr[i], '1');
        }
        int count = 0;
        for(int i = 0;i < arr.size(); i = i + 2){
            if(count % 2 == 0){
                newArr[arr.get(i)][arr.get(i + 1)] = 'x';
            }
            else {
                newArr[arr.get(i)][arr.get(i + 1)] = 'o';
            }
            count++;
        }
        int count1 = 0;
        for(int i = 0;i < newArr.length; i++ ){
            if(newArr[i][i] == 'x'){
                count1++;
                if(count1 == 3){
                    return "A";
                }
            }
        }
        count1 = 0;
        for(int i = 0;i < newArr.length;i++){
            if(newArr[i][i] == 'o'){
                count1++;
                if(count1 == 3){
                    return "B";
                }
            }
        }
        count1 = 0;
        for(int i = 0;i < newArr.length; i++){
            if(newArr[i][newArr.length - 1 - i] == 'x'){
                count1++;
                if(count1 == 3){
                    return "A";
                }
            }
        }
        count1 = 0;
        for(int i = 0;i < newArr.length; i++ ){
            if(newArr[i][newArr.length - 1 - i] == 'o'){
                count1++;
                if(count1 == 3){
                    return "B";
                }
            }
        }
        for(int j = 0;j < newArr[0].length; j++){
            int counting = 0;
            for (int i = 0; i < newArr.length; i++){
                if(newArr[i][j] == 'x'){
                    counting++;
                }
            }
            if(counting == 3){
                return "A";
            }
        }
        for(int j = 0;j < newArr[0].length; j++){
            int counting = 0;
            for (int i = 0; i < newArr.length; i++){
                if(newArr[i][j] == 'o'){
                    counting++;
                }
            }
            if(counting == 3){
                return "B";
            }
        }
        for(int i = 0;i < newArr.length; i++){
            int counting = 0;
            for(int j = 0;j < newArr[i].length; j++){
                if(newArr[i][j] == 'x'){
                    counting++;
                }
            }
            if(counting == 3) return "A";
        }
        for(int i = 0;i < newArr.length; i++){
            int counting = 0;
            for(int j = 0;j < newArr[i].length; j++){
                if(newArr[i][j] == 'o'){
                    counting++;
                }
            }
            if(counting == 3) return "B";
        }

        count1 = 0;
        for(int i = 0;i < arr.size(); i = i + 2){
            count1++;
        }
        if(count1 < 9) return "Pending";
        return  "Draw";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row :");
        int row = scan.nextInt();
        System.out.println("ENter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        String result = tictactoe(nums);
        System.out.println(result);
    }
}