// 60. Permutation Sequence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class permutationsequence{
    public static String Permutation(int n ,int k){
        int fact = 1;
        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1;i < n;i++){
            fact = fact * i;
            number.add(i);
        }
        number.add(n);
        k = k - 1;
        StringBuilder ans = new StringBuilder();
        while(true){
            ans.append(number.get(k / fact));
            number.remove(k / fact);
            if(number.size() == 0) break;

            k = k % fact;
            fact = fact / number.size();
        }
        return ans.toString();
    }
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = scan.nextInt();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = Permutation(n, k);
        System.out.println("Kth Permutation is to :"+result);
    }
}