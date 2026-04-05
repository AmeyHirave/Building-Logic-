public class Calculation_2 {
    public static void main(String [] args) {
        int a = 10;
        int b = 29;
        int c = 32;
        int d = 22;

        System.out.println(addition(a,b,c,d));
        System.out.println(subtraction(a,b,c,d));
        System.out.println(multiplication(a,b,c,d));
        System.out.println(division(a,b));

    }

    
    public static int addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    public static int subtraction(int a, int b, int c, int d) {
        return a - b - c - d;
    }
    
    public static int multiplication(int a, int b, int c, int d) {
        return a * b * c * d;    
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
