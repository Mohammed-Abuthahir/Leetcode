// 171. Excel Sheet Column Number
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class excelcolumnumber{
    public static int titleToNumber(String columnTitle){
        int result = 0;
        for(char c : columnTitle.toCharArray()){
            int val = c - 'A' + 1;
            result = result * 26 + val;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String Number :");
        String columnTitle = scan.next();
        int result = titleToNumber(columnTitle);
        System.out.println(result);
    }
}