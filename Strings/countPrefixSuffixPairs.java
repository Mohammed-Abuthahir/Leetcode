// Count Prefix and Suffix Pairs I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countPrefixSuffixPairs{
    public static int countPrefixSuffixPairs(int[] arr){
        int count = 0;
        for(int i = 0;i < words.length; i++){
            for(int j = i + 1;j < words.length; j++){
                if(words[j].startsWith(words[i])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        String[] arr = new String[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int result = countPrefixSuffixPairs(arr);
        System.out.println(result);
    }
}