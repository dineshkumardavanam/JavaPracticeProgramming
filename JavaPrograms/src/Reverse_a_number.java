import org.w3c.dom.ls.LSOutput;

public class Reverse_a_number {
    public static void main(String[] args) {
//        int n = 1234567890;
//        while (n > 0) {
//            int lastDigit = n % 10;
//            System.out.print(lastDigit +" ");
//            n = n / 10;
//
//        }
//        System.out.println();
            int n=1234;
            int rev=0;
            while(n>0){
                int lastDigit=n%10;
                rev=(rev*10)+lastDigit;
                n=n/10;

            }
        System.out.println(rev);
    }
}
