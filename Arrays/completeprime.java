// 3765. Complete Prime Number
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class completeprime{
    public static boolean isprime(int num){
        if(num <= 1) return true;
        for(int i = 2;i * i <= num ;i++){
            if(num % i == 0){
                return true;
            }
        }
        return false;
    }
    public static boolean completePrime(int num){
        if(!isprime(num)){
            String number = String.valueOf(num);
            ArrayList<Integer> prefix = new ArrayList<>();
            ArrayList<Integer> suffix = new ArrayList<>();
            StringBuilder p = new StringBuilder();
            for(char c : number.toCharArray()){
                p.append(c);
                prefix.add(Integer.parseInt(p.toString()));
            }
            int temp = num;
            int multiplier = 1;
            while (temp > 0) {
                int suffix1 = num % (multiplier * 10);
                suffix.add(suffix1);
                multiplier *= 10;
                temp /= 10;
            }
            for(int i = 0;i < prefix.size();i++){
                if(isprime(prefix.get(i))){
                    return false;
                }
            }
            for(int i = 0;i < suffix.size();i++){
                if(isprime(suffix.get(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        boolean result = completePrime(num);
        System.out.println(result);
    }
}