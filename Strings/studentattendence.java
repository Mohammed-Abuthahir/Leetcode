// i551. Student Attendance Record I
import java.util.*;
import java.util.Scanner;
class studentattendence{
    public static boolean checkRecord(String s) {
       int Acount = 0;
       for(int i = 0;i < s.length();i++){
           if(s.charAt(i) == 'A'){
               Acount++;
               if(Acount >= 2){
                    return false;
               }
           }
       }
       int max = 0;
       int Lcount = 0;
       for(int i = 0; i < s.length();i++){
           if(s.charAt(i) == 'L'){
               Lcount++;
               max = Math.max(Lcount,max);
           }
           else{
               Lcount = 0;
           }
       }
       return  max < 3 ? true : false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Student details :");
        String s = scan.nextLine();
        boolean result = checkRecord(s);
        System.out.println(result);
    }
}