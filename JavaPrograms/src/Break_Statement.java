import java.util.*;
public class Break_Statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your number");
            int n=sc.nextInt();
            if(n%10==0)
                break;
            System.out.println(n);
        }
        System.out.println("Multiple of 10!");
        }
}
