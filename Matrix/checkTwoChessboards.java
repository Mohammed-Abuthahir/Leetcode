// 3274. Check if Two Chessboard Squares Have the Same Color
import java.util.*;
class checkTwoChessboards{
    public static boolean checktwochess(String coordinate1, String coordinate2){
        String[][] board = {
                {"a8W", "b8B", "c8W", "d8B", "e8W", "f8B", "g8W", "h8B"},
                {"a7B", "b7W", "c7B", "d7W", "e7B", "f7W", "g7B", "h7W"},
                {"a6W", "b6B", "c6W", "d6B", "e6W", "f6B", "g6W", "h6B"},
                {"a5B", "b5W", "c5B", "d5W", "e5B", "f5W", "g5B", "h5W"},
                {"a4W", "b4B", "c4W", "d4B", "e4W", "f4B", "g4W", "h4B"},
                {"a3B", "b3W", "c3B", "d3W", "e3B", "f3W", "g3B", "h3W"},
                {"a2W", "b2B", "c2W", "d2B", "e2W", "f2B", "g2W", "h2B"},
                {"a1B", "b1W", "c1B", "d1W", "e1B", "f1W", "g1B", "h1W"}
        };
        StringBuilder firstboard = new StringBuilder();
        StringBuilder secondboard = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String str = board[i][j];
                if (str.startsWith(coordinate1)) {
                    firstboard.append(str.charAt(str.length() - 1));
                }
                if (str.startsWith(coordinate2)) {
                    secondboard.append(str.charAt(str.length() - 1));
                }
            }
        }
        return firstboard.toString().equals(secondboard.toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String coordinate1 = scan.next();
        System.out.println("Enter the String 2 : ");
        String coordinate2 = scan.next();
        boolean result = checktwochess(coordinate1, coordinate2);
        System.out.println(result);
    }
}