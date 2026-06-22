// 999. Available Captures for Rook
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numRookCaptures{
    public static int captureRook(char[][] board){
        int rookRow = 0; int rookcol = 0;
        for(int i = 0;i < board.length; i++){
            for(int j = 0;j < board[i].length; j++){
                if(board[i][j] == 'R'){
                    rookRow = i;
                    rookcol = j;
                    break;
                }
            }
        }
        int count = 0;
        for (int i = rookRow; i < board.length; i++) {
            if (board[i][rookcol] == 'p') {
                count++;
                break;
            }
            if (board[i][rookcol] == 'B') {
                break;
            }
        }
        for (int i = rookRow - 1; i >= 0; i--) {
            if (board[i][rookcol] == 'p') {
                count++;
                break;
            }
            if (board[i][rookcol] == 'B') {
                break;
            }
        }
        for(int i = rookcol; i < board.length; i++){
            if(board[rookRow][i] == 'p'){
                count++;
                break;
            }
            if(board[rookRow][i] == 'B'){
                break;
            }
        }
        for(int i = rookcol - 1; i >= 0; i--){
            if(board[rookRow][i] == 'p'){
                count++;
                break;
            }
            if(board[rookRow][i] == 'B'){
                break;
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
        System.out.println("Enter the borad :");
        char[][] board = new char[row][cols];
        for(int i = 0;i < board.length; i++){
            for(int j = 0;j < board[i].length;j++){
                board[i][j] = scan.next().charAt(0);
            }
        }
        int result = captureRook(board);
        System.out.println(result);
    }
}