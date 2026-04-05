import java.util.Scanner;
public class Even_Odd_3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number : ");
        int isEven = sc.nextInt();
        System.out.println("The number is : "+checkEven(isEven));
        sc.close();
    }

    private static String checkEven(int isEven) {
        return isEven % 2 == 0 ? "Even" : "Odd";
    }

}
