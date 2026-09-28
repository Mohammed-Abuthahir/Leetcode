// 2037. Minimum Number of Moves to Seat Everyone
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minMovesToSeat{
    public static int minMoves(int[] seats, int[] student){
        Arrays.sort(seats);
        Arrays.sort(student);
        int sum = 0;
        for(int i = 0;i < seats.length; i++){
            sum = sum + Math.abs(seats[i] - student[i]);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seats : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the students : ");
        int n2 = scan.nextInt();
        System.out.println("Enter the Seats : ");
        int[] seats = new int[n1];
        for(int i = 0;i < seats.length; i++){
            seats[i] = scan.nextInt();
        }
        System.out.println("Enter the students : ");
        int[] student = new int[n2];
        for(int i = 0;i < student.length; i++){
            student[i] = scan.nextInt();
        }
        int result = minMoves(seats, student);
        System.out.println(result);
    }
}
