public class FibonacciSeries {
    public static void main(String [] args) {
        int fibNumber = 10;
        int temp1 = 0;
        int temp2 = 1;
        System.out.println(temp1);
        System.out.println(temp2);
        for(int i = fibNumber; i > 0; i--) {
            int crt = temp1 + temp2;
            System.out.print(crt+ " ");
            temp1 = temp2;
            temp2 = crt;
        }
    }
}
