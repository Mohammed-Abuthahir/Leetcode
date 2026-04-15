// 3280. Convert Date to Binary
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class datatobinaryNum{
    public static String convertDateToBinary(String date){
        StringBuilder sb = new StringBuilder();
       ArrayList<String> list = new ArrayList<>();
       for(int i = 0;i < date.length();i++){
           if(date.charAt(i) != '-'){
               sb.append(date.charAt(i));
           }
           else if(date.charAt(i) == '-'){
               String BigNum = Integer.toBinaryString(Integer.parseInt(sb.toString()));
               list.add(BigNum);
               sb.setLength(0);
           }
       }
        String binaryString = Integer.toBinaryString(Integer.parseInt(sb.toString()));
        list.add(binaryString);
        StringBuilder s = new StringBuilder();
        for(String num : list){
            s.append(num);  
            s.append('-');
        }
        s.delete(s.length() - 1,'-');
        return s.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Date :");
        String date = scan.next();
        String result = convertDateToBinary(date);
        System.out.println(result);
    }
}