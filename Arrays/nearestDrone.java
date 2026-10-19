// 4024. Nearest Available Drone
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class nearestDrone{
    public static int nearestdrone(int[][] drones, int[] target){
        int tx = target[0];
        int ty = target[1];
        int minDistance = Integer.MAX_VALUE;
        int bestIndex = -1;
        for(int i = 0;i < drones.length; i++){
            int x = drones[i][0];
            int y = drones[i][1];
            int range = drones[i][2];
            int distance = Math.abs(x - tx) + Math.abs(y - ty);
            if(distance <= range){
                if(distance < minDistance){
                    minDistance = distance;
                    bestIndex = i;
                }
            }
        }
        return bestIndex;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int r = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int c = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] drones = new int[r][c];
        for(int i = 0;i < drones.length; i++){
            for(int j = 0;j < drones[i].length; j++){
                drones[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the n : ");
        int n = scan.nextInt();
        System.out.println("Enter the Target : ");
        int[] target = new int[2];
        for(int i = 0;i < target.length; i++){
            target[i] = scan.nextInt();
        }
        int result = nearestdrone(drones, target);
        System.out.println(result);
    }
}