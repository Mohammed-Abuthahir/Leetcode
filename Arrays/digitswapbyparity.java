// 2231. Largest Number After Digit Swaps by Parity
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class digitswapbyparity{
    public static int largestInteger(int num){
        char[] arr = String.valueOf(num).toCharArray();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0;i < arr.length; i++){
            if((arr[i] - '0') % 2 == 0) even.add(arr[i] - '0');
            else odd.add(arr[i] - '0');
        }
        Collections.sort(even); Collections.sort(odd);
        Collections.reverse(even); Collections.reverse(odd);
        int i = 0;
        int evenIndex = 0;
        int oddIndex = 0;
        StringBuilder sb = new StringBuilder();
        while (i < arr.length) {
            if ((arr[i] - '0') % 2 == 0) {
                sb.append(even.get(evenIndex));
                evenIndex++;
            } else {
                sb.append(odd.get(oddIndex));
                oddIndex++;
            }
            i++;
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = largestInteger(num);
        System.out.println(result);
    }
}