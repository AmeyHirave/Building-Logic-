import java.util.Scanner;

public class LCMandGDCofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = GCD(num1, num2);
        System.out.println("The GCD is : " + gcd);
        System.out.println("The LCM is : "+ LCM(num1, num2, gcd));
        sc.close();
    }

    public static int GCD(int num1, int num2) {
        
        int gcd = 0;
        int min = Math.min(num1,num2);
        for(int i = 1; i < min; i++){
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int LCM(int num1, int num2, int gcd) {
        /* Formula :  LCM = (a * b) / gcd */
        return num1 * num2 / gcd;
    }
}