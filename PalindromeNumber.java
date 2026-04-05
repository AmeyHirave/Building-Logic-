import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isPalindrome = sc.nextInt();
        System.out.println(checkPalindromeNumber(isPalindrome));
        sc.close();
    }

    protected static boolean checkPalindromeNumber(int isPalindrome) {
        int tempCheck = isPalindrome;
        int temp = 0;
        while (tempCheck != 0) {
            temp = temp * 10;
            temp = temp + tempCheck % 10;
            tempCheck /= 10;
        }
        return isPalindrome == temp ? true : false;
    }
}
