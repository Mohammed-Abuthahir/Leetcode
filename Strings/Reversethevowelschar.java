import java.util.Scanner;

class Reversethevowelschar {

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ((arr[left] == 'a' || arr[left] == 'A' || arr[left] == 'e' ||
                 arr[left] == 'E' || arr[left] == 'i' || arr[left] == 'I' ||
                 arr[left] == 'o' || arr[left] == 'O' || arr[left] == 'u' ||
                 arr[left] == 'U') &&
                (arr[right] == 'a' || arr[right] == 'A' || arr[right] == 'e' ||
                 arr[right] == 'E' || arr[right] == 'i' || arr[right] == 'I' ||
                 arr[right] == 'o' || arr[right] == 'O' || arr[right] == 'u' ||
                 arr[right] == 'U')) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if (arr[left] == 'a' || arr[left] == 'A' || arr[left] == 'e' ||
                     arr[left] == 'E' || arr[left] == 'i' || arr[left] == 'I' ||
                     arr[left] == 'o' || arr[left] == 'O' || arr[left] == 'u' ||
                     arr[left] == 'U') {
                right--;
            }
            else if (arr[right] == 'a' || arr[right] == 'A' || arr[right] == 'e' ||
                     arr[right] == 'E' || arr[right] == 'i' || arr[right] == 'I' ||
                     arr[right] == 'o' || arr[right] == 'O' || arr[right] == 'u' ||
                     arr[right] == 'U') {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();

        String result = reverse(s);
        System.out.println(result);  
    }
}
