// 2595. Number of Even and Odd Bits
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numberofevenandodd{
    public static int[] evenandodd(int n){
        char[] arr =(Integer.toBinaryString(n)).toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0;i < arr.length;i++){
            if((i & 1) == 0 && arr[i] == '1'){
                evencount++;
            }
            else if((i & 1) == 1 && arr[i] == '1'){
                oddcount++;
            }
        }
        int[] nums = {evencount,oddcount};
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int[] result = evenandodd(n);
        System.out.println(Arrays.toString(result));
    }

}
