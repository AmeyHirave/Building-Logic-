import java.util.Scanner;
public class PrimeInRange {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Range : ");
        int startRange = sc.nextInt();
        System.out.println("Enter End Range : ");
        int endRange = sc.nextInt();
        
        primeInRange(startRange, endRange);

        sc.close();
    }

    public static void primeInRange (int startRange, int endRange) {
        for (int i = startRange; i <= endRange; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
