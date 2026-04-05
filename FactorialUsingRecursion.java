public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Final : " + reverseFactorial(num));
    }

    public static int reverseFactorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            // int temp2 = reverseFactorial(num - 1);
            // System.out.println(temp2);
            // int temp = num * temp2;
            // //System.out.println(temp);
            // return temp;

            return num * reverseFactorial(num-1);
        }
    }
}
