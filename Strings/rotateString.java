// 796. Rotate String
import java.util.Scanner;
class rotateString{
    public static boolean rotate(String s,String goal){
         if(s.length() != goal.length()) return false;
         return (s + s).indexOf(goal) != -1 ? true : false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the s :");
        String s = scan.nextLine();
        System.out.println("Enter the goal :");
        String goal = scan.nextLine();
        boolean result = rotate(s,goal);
        System.out.println(result);
    }
}