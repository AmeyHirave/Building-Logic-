public class ReverseNumber {
    public static void main(String [] args) {
        int num = 123;
        int temp = 0;

        while(num != 0) {
            temp =  temp * 10;
            System.out.println("Hey : "+temp);
            temp = temp + num % 10;
            System.out.println(temp);
            num = num / 10;
        }
    }
}
