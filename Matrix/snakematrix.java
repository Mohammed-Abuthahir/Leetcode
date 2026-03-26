// 3248. Snake in Matrix
import java.util.*;
class snakematrix {
    public static int finalPositionOfSnake(List<String> commands, int n) {
        int r = 0; 
        int c = 0; 
        for (String command : commands) {
            if (command.equals("DOWN")) {
                r++;
            } else if (command.equals("UP")) {
                r--;
            } else if (command.equals("RIGHT")) {
                c++;
            } else if (command.equals("LEFT")) {
                c--;
            }
        }
        return (r * n) + c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter matrix size (n): ");
        int n = scan.nextInt();
        System.out.print("Enter number of commands: ");
        int numCommands = scan.nextInt();
        List<String> commands = new ArrayList<>();
        System.out.println("Enter commands (UP, DOWN, LEFT, RIGHT):");
        for (int i = 0; i < numCommands; i++) {
            commands.add(scan.next().toUpperCase());
        }
        int result = finalPositionOfSnake(commands, n);
        System.out.println("Final Position: " + result);
    }
}