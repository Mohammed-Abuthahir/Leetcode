// 1450. Number of Students Doing Homework at a Given Time
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numberofstudents{
    public static int countthestudents(int[] startTime,int[] endTime,int queryTime){
        int firstpointer = 0;
        int secondpointer = 0;
        int studentcount = 0;
        while(firstpointer < startTime.length && secondpointer < endTime.length){
            if(startTime[firstpointer] <= queryTime && endTime[secondpointer] >= queryTime){
                studentcount++;
                firstpointer++;
                secondpointer++;
            }
            else{
                firstpointer++;
                secondpointer++;
            }
        }
        return studentcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2:");
        int n2 = scan.nextInt();
        System.out.println("Enter the Starttime :");
        int[] startTime = new int[n1];
        for(int i = 0;i<startTime.length;i++){
            startTime[i] = scan.nextInt();
        }
        System.out.println("Enter the endTime :");
        int[] endTime = new int[n2];
        for(int i = 0;i<endTime.length;i++){
            endTime[i] = scan.nextInt();
        }
        System.out.println("Enter the Query Time");
        int queryTime  = scan.nextInt();
        int result = countthestudents(startTime,endTime,queryTime);
        System.out.println("Number of Students is :"+result);

    }
}