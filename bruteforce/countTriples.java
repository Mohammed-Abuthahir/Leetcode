// 1925. Count Square Sum Triples
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class countTriples{
    public static int counttriples(int n){
     List<Integer> nums = new ArrayList<>();
      for(int i = 1;i <= n; i++){
          nums.add(i);
      }
      int count = 0;
      for(int i = 0;i < nums.size(); i++) {
          for (int j = 0; j < nums.size(); j++) {
              for (int k = 0; k < nums.size(); k++) {
                  if ((nums.get(i) * nums.get(i)) + (nums.get(j) * nums.get(j)) == nums.get(k) * nums.get(k)){
                      count++;
                  }
              }
          }
      }
      return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = counttriples(n);
        System.out.println(result);
    }
}