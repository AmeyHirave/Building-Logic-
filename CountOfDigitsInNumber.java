import java.util.Scanner;

public class CountOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();
        checkCount(num);
        input.close();
    }

    public static void checkCount(int num) {
        String conversionOfNum = Integer.toString(num);
        int length = conversionOfNum.length();
        System.out.println("The count is " + length);
    }
}
