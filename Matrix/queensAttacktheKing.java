// 1222. Queens That Can Attack the King
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class queensAttacktheKing{
    private static List<Integer> getIntegers(int[] king, char[][] board) {
        List<Integer> arr = new ArrayList<>();
          for (int i = king[0] - 1; i >= 0; i--) {
              if (board[i][king[1]] == 'q') {
                  arr.add(i);
                  arr.add(king[1]);
                  break;
              }
          }
        for (int i = king[0] + 1; i < board.length; i++) {
            if (board[i][king[1]] == 'q') {
                arr.add(i);
                arr.add(king[1]);
                break;
            }
        }
        for (int j = king[1] - 1; j >= 0; j--) {
            if (board[king[0]][j] == 'q') {
                arr.add(king[0]);
                arr.add(j);
                break;
            }
        }
        for (int j = king[1] + 1; j < board[0].length; j++) {
            if (board[king[0]][j] == 'q') {
                arr.add(king[0]);
                arr.add(j);
                break;
            }
        }
        for (int i = king[0] - 1, j = king[1] - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'q') {
                arr.add(i);
                arr.add(j);
                break;
            }
        }
        for (int i = king[0] - 1, j = king[1] + 1;
             i >= 0 && j < board[0].length;
             i--, j++) {

            if (board[i][j] == 'q') {
                arr.add(i);
                arr.add(j);
                break;
            }
        }
        for (int i = king[0] + 1, j = king[1] - 1;
             i < board.length && j >= 0;
             i++, j--) {

            if (board[i][j] == 'q') {
                arr.add(i);
                arr.add(j);
                break;
            }
        }
        for (int i = king[0] + 1, j = king[1] + 1;
             i < board.length && j < board[0].length;
             i++, j++) {

            if (board[i][j] == 'q') {
                arr.add(i);
                arr.add(j);
                break;
            }
        }

        return arr;
    }
    public static List<List<Integer>> queensattacktheking(int[][] queens, int[] king) {
        char[][] board = new char[8][8];
        List<Integer> nums = new ArrayList<>();
        for(int i = 0;i < queens.length; i++){
            for(int j = 0;j < queens[i].length; j++){
                nums.add(queens[i][j]);
            }
        }
        for(int i = 0;i < board.length; i++){
            Arrays.fill(board[i], '1');
        }
        for(int i = 0;i < nums.size(); i = i + 2){
            board[nums.get(i)][nums.get(i + 1)] = 'q';
        }
        board[king[0]][king[1]] = 'k';
        List<Integer> arr = getIntegers(king, board);
        List<List<Integer>> subset = new ArrayList<>();
        List<Integer> example = new ArrayList<>();
        for(int i = 0;i < arr.size(); i = i + 2){
            example.add(arr.get(i));
            example.add(arr.get(i + 1));
            subset.add(new ArrayList<>(example));
            example.clear();
        }
        return subset;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] queen = new int[row][cols];
        for(int i = 0;i < queen.length; i++){
            for(int j = 0;j < queen[i].length; j++){
                queen[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the King :");
        int[] king = new int[n];
        for(int i = 0;i < king.length; i++){
            king[i] = scan.nextInt();
        }
        List<List<Integer>> result = queensattacktheking(queen, king);
        System.out.println(result);
    }
}