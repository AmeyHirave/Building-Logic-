import java.util.Scanner;
public class IsPrime {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int isPrimeNumber = sc.nextInt();
        System.out.println(isPrime(isPrimeNumber));
        sc.close();
    }

    public static String isPrime(int isPrimeNumber) {
        
        for (int i = 2; i < isPrimeNumber; i++) {
            if(isPrimeNumber % i == 0) {
                 return "Not Prime";
            }
        }
        return "Prime";        
    }

}
