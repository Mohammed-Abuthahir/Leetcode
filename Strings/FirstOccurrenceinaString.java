// 28. Find the Index of the First Occurrence in a String
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FirstOccurrenceinaString{
    public static int occurance(String str1,String str2){
        int index = str1.indexOf(str2);
        return index;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String str1 = scan.nextLine();
        System.out.println("Enter the String 2 :");
        String str2 = scan.nextLine();
        int firstoccurance = occurance(str1,str2);
        System.out.println("First Occurrence in a String index is :" + firstoccurance);
    }
}