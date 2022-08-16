import java.util.Scanner;

public class calculator_using_functions {
    public static void calculatorApp(char n, int a, int b){
        switch (n) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            case '%' -> System.out.println(a % b);
            default -> System.out.println("Invalid Operator Entered");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char n = sc.next().charAt(0);
        int a=sc.nextInt();
        int b=sc.nextInt();

        calculatorApp(n,a,b);
    }
}
